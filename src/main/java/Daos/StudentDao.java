package Daos;

import org.hibernate.classic.Session;

import com.Pojo.Student;

public class StudentDao {

	public void studentRegistrarion(Student student) {
		Session openSession = DbUtil.getSessionFactory().openSession();
		openSession.save(student);
		openSession.beginTransaction().commit();
		openSession.close();
	}
}
