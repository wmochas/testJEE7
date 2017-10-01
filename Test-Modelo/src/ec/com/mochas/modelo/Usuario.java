package ec.com.mochas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_USUARIO")
@NamedQuery(name = "Usuario.buscarTodos", query = "Select u from Usuario u")
public class Usuario {

	@Id
	@SequenceGenerator(name = "codigoUsuarioGen", sequenceName = "test_seq_usuario")
	@GeneratedValue(generator = "codigoUsuarioGen") // strategy=GenerationType.SEQUENCE
	@Column(name = "codigo_usuario")
	private Long codigoUsuario;

	@Column(length = 150)
	private String usuario;

	@Column(length = 150)
	private String clave;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String nombre) {
		this.usuario = nombre;
	}

	public Long getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
