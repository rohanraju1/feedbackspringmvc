package org.caps.dev.feeback.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.caps.dev.feeback.beans.Employee;
import org.caps.dev.feeback.beans.Faculty;
import org.caps.dev.feeback.dbutils.JpaHibernateUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements DaoInf {

	@Override
	public Employee getLoginData(int empId, String password) {

		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction etx=null;
		Employee e1=null;
		try {
			emf=JpaHibernateUtils.getEMF();
			em=emf.createEntityManager();
			etx=em.getTransaction();
			etx.begin();
			
			TypedQuery<Employee> query = em
					.createQuery("select e from Employee e where employee_ID=:id",Employee.class);
			
			 e1=query.setParameter("id", empId).getSingleResult();
			
			etx.commit();
		} catch (Exception e) {

			etx.rollback();
                e.printStackTrace();			
		}
		
		return e1;
	}

	@Override
	public boolean getEmployeeDetails(int facultyId, String eName) {

		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction etx=null;
		boolean status=true;
		try {
			emf=JpaHibernateUtils.getEMF();
			em=emf.createEntityManager();
			etx=em.getTransaction();
			etx.begin();
			
			Query query = em
					.createNativeQuery("select * from employee_master e where e.Employee_ID=:id in(select f.Faculty_Id from faculty_skill f)"
							+ "and e.EmployeeName=:name");
			
			 query.setParameter("id",facultyId);
			 query.setParameter("name",eName);
			 
			 int record=query.getFirstResult();
			 if(record>1)
			 {
				 status=false;
			 }
			etx.commit();
		} catch (Exception e) {

			etx.rollback();
                e.printStackTrace();			
		}

		return status;
	}

	@Override
	public boolean addFaculty(Faculty faculty) {

		boolean addStatus=false;
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction etx=null;
		try {
			emf=JpaHibernateUtils.getEMF();
			em=emf.createEntityManager();
			etx=em.getTransaction();
			etx.begin();
			
	  Query query = em
					.createNativeQuery("insert into faculty_skill values(?1,?2,?3)");
		 query.setParameter(1,faculty.getPid());	 
	  query.setParameter(2,faculty.getFacultyId());
			 query.setParameter(3,faculty.getSkillSet());
			 
			 int count=query.executeUpdate();
			 
			 if(count>0)
			 {
				 System.out.println(count);
				 addStatus=true;
			 }
			 
			etx.commit();
		} 
		catch (Exception e) {
			etx.rollback();
                e.printStackTrace();			
		}
		return addStatus;
	}

	
	
	
	
}
