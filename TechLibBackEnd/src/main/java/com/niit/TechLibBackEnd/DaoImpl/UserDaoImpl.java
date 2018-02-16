package com.niit.TechLibBackEnd.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.TechLibBackEnd.Model.User;

@Repository
@Service
		
public class UserDaoImpl {

		
		
			@Autowired
			SessionFactory sessionFactory;
		public UserDaoImpl(){};
			
			UserDaoImpl(SessionFactory sessionFactory)
			{
				this.sessionFactory=sessionFactory;
			}

			/*//@Transactional
			public void insertUser(User user) {
				// TODO Auto-generated method stub
				Session session=sessionFactory.openSession();
				session.beginTransaction();
				session.saveOrUpdate(user);
				session.getTransaction().commit();
			}*/
			public void insertUser(User user) {
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				try {
					session.save(user);
				//	return true;
				} catch (Exception e) {
					e.printStackTrace();
					///return false;
				} finally {
					session.getTransaction().commit();
					session.close();
				}
			}

		
				
	
}
