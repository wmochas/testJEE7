package ec.com.mochas.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.mochas.dao.CabeceraDao;
import ec.com.mochas.modelo.Cabecera;

@Stateless
public class CabeceraEjb {

	@EJB
	private CabeceraDao cabeceraDao;

	public void insertar(Cabecera cabecera) {
		cabeceraDao.insertar(cabecera);
	}

	public CabeceraDao getCabeceraDao() {
		return cabeceraDao;
	}

}
