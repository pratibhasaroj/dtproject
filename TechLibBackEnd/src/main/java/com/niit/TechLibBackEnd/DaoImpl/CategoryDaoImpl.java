package com.niit.TechLibBackEnd.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TechLibBackEnd.Model.Category;

@Repository
@Service
public class CategoryDaoImpl {
		
		@Autowired
		SessionFactory sessionFactory;
		@Autowired
		public
		
		CategoryDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
		@Transactional
		public void insertSupplier(Category category) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(category);
			session.getTransaction().commit();
		}

		
		
		
	}

