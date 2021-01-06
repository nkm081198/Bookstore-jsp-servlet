import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ngocnh.app.entity.Users;

public class UsersTest {
	public static void main(String[] args) {
		Users u = new Users();
		u.setFullName("Ngoc1");
		u.setEmail("ngocnh@gmail1.com");
		u.setPassword("hello1");
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(u);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		createEntityManagerFactory.close();
		
	}
}
