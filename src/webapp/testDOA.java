package webapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class testDOA {

	public static void main(String[] args) {
		//creating factory for getting sessions
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		//creating a new session for adding products
		Session session = factory.openSession();
		session.beginTransaction();
		ToDoItem item1 = new ToDoItem(1, "clean", "clean the room");
		ToDoItem item2 = new ToDoItem(2, "shopping", "buy eggs");
		ToDoItem item3 = new ToDoItem(3, "shopping", "buy star wars tickets");
		session.save(item1);
		session.save(item2);
		session.save(item3);
		session.getTransaction().commit();
		session.close();

	}

}
