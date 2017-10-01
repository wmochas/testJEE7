package ec.com.mochas.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@NamedQuery(name = "consultar.todo", query = "select c from Cabecera c")
public class Cabecera implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_cabecera")
	private Integer Id;

	private String descripcion;

	private Date fecha;

	@Transient	
	//podemos usar lo siguiente tambien
	//@Formula(value="(select SUM(d.valor) from Detalle d where d.codigo_cabecera=codigo_cabecera)")
	private BigDecimal total;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cabecera", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Detalle> detalles;

	public Cabecera() {
		total = new BigDecimal(0);
		detalles = new ArrayList<Detalle>();
		this.fecha = Calendar.getInstance().getTime();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotal() {
		total = new BigDecimal(0);
		if (detalles != null) {
			for (Iterator<Detalle> iterator = detalles.iterator(); iterator.hasNext();) {
				Detalle detalle = iterator.next();
				total = total.add(detalle.getValor());
			}
		}
		return total;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

}
