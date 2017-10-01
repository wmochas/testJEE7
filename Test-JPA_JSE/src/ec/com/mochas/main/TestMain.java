package ec.com.mochas.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ec.com.mochas.dao.UsuarioDao;
import ec.com.mochas.modelo.Usuario;
/*
 * Clase principal de prueba de uso de JPA en ambientes JSE.
 * Tener en cuenta lo siguiente:
 * 1. Configurar de manera correcta en el buildpath las librerias necesarios: 
 * 	- proveedor de persistencia, en este caso hibernate
 *  - jdbc driver, en este caso oracle
 * 2. Configurar de manera correcta el archivo persistence.xml, el cual debe estar en la 
 * 	carpeta META-INF
 * 3. Crear las entidades, usando las anotaciones correspondientes
 * 4. Crear los dao correspondientes
 * */
public class TestMain {

	public static void main(String[] args) {
		//obtengo acceso a la base de datos
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//obtengo un dao para interactuar con usuarios
		UsuarioDao usuarioDao = new UsuarioDao(entityManager);   
		//consulto los usuarios actuales
		List<Usuario> usuarios = usuarioDao.consultarTodo();
		System.out.println("USUARIOS:" );
		int i=0;
		for (Usuario u : usuarios) {
			i++;
			System.out.println("-Usuario "+i);
			System.out.println(" * Usuario:" + u.getUsuario());
			System.out.println(" * Clave:" + u.getClave());
		}
		i++;
		Usuario usuario1 = new Usuario();
		usuario1.setClave("clave"+i);
		usuario1.setUsuario("usuario"+i);
		usuarioDao.insertar(usuario1);
 		Long id=usuario1.getCodigoUsuario();
		System.out.println(" ** Se obtuvo id:" + id);
		
		usuario1.setUsuario(usuario1.getUsuario()+"_actualizado");
		usuarioDao.actualizar(usuario1);
		usuario1=usuarioDao.buscarPorId(id);
		System.out.println("-Usuario buscado por id"+id);
		System.out.println(" * Usuario:" + usuario1.getUsuario());
		System.out.println(" * Clave:" + usuario1.getClave());
		entityManager.close();
		entityManagerFactory.close();	
	}
}