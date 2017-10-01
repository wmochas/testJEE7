package ec.com.mochas.dao;

import java.util.List;

import javax.ejb.Stateless;

import ec.com.mochas.modelo.Usuario;

@Stateless
public class UsuarioDao extends GenericoDao<Usuario, Long> {

	//private static Logger logger = Logger.getLogger(Usuario.class);
//	@Inject
//	private Logger log;
	
	public UsuarioDao() {
		super(Usuario.class);
	}

	public List<Usuario> consultarTodo() {
		return this.consultarPorNamedQuery("Usuario.buscarTodos");
	}
	
//	public User findByLoginPwd(String login, String pwd) {
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<User> criteria = cb.createQuery(User.class);
//		Root<User> user = criteria.from(User.class);
//		criteria.select(user).where(cb.equal(user.get("login"), login)).where(cb.equal(user.get("pwd"), pwd));
//		return entityManager.createQuery(criteria).getSingleResult();
//	}
}