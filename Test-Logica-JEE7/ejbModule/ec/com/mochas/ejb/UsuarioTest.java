package ec.com.mochas.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.jboss.logging.Logger;

import ec.com.mochas.dao.UsuarioDao;

/**
 * Session Bean implementation class UsuarioTest
 */
@Singleton
@Startup
public class UsuarioTest {

	private static Logger logger = Logger.getLogger(UsuarioTest.class);

	@EJB
	UsuarioDao usuarioDao;

	@PostConstruct // se ejecuta luego de cargado el ejb
	public void test() {
		logger.info("************** ESTOY AQUI ************");
		// descomentar para tests

		// consulto los usuarios actuales
		// List<Usuario> usuarios = usuarioDao.consultarTodo();
		// System.out.println("USUARIOS:");
		// int i = 0;
		// for (Usuario u : usuarios) {
		// i++;
		// System.out.println("-Usuario " + i);
		// System.out.println(" * Usuario:" + u.getUsuario());
		// System.out.println(" * Clave:" + u.getClave());
		// }
		// i++;
		// Usuario usuario1 = new Usuario();
		// usuario1.setClave("clave" + i);
		// usuario1.setUsuario("usuario" + i);
		// usuarioDao.insertar(usuario1);
		// Long id = usuario1.getCodigoUsuario();
		// System.out.println(" ** Se obtuvo id:" + id);
		//
		// usuario1.setUsuario(usuario1.getUsuario() + "_actualizado");
		// usuarioDao.actualizar(usuario1);
		// usuario1 = usuarioDao.buscarPorId(id);
		// System.out.println("-Usuario buscado por id" + id);
		// System.out.println(" * Usuario:" + usuario1.getUsuario());
		// System.out.println(" * Clave:" + usuario1.getClave());
	}
}
