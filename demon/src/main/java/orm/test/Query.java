/*package orm.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import orm.entity.User;

public class Query {

	public void query() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had
			// trouble building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List result = session.createQuery("from orm.entity.User").list();
		for (User user : (List<User>) result) {
			System.out.println("User (" + user.getUserName() + ") : " + user.getPassWord());

		}
		session.getTransaction().commit();
		session.close();
	}
}
*/