package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// String jpql = "select u from usuario u";
		// TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		// query.setMaxResults(50);
		
		List<Usuario> usuarios = em
				.createQuery("select u from usuario u", Usuario.class)
				.setMaxResults(50)
				.getResultList();
		
		for (Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() 
			+ "Nome: " + usuario.getNome()
			+ "E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
