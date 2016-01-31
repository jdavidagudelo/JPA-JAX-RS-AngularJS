package dao;

import java.util.List;

import javax.naming.NamingException;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import model.Sample;

public class SampleDao extends AbstractDao {
	
	public SampleDao() throws NamingException {
		super();
	}
	public Sample create(Sample sample){
		Sample current = getById(sample.getId());
		if(current != null){
			current.setText(sample.getText());
			sample = current;
		}
		EntityTransaction et = entityManager.getTransaction();

		et.begin();
		entityManager.persist(sample);
		entityManager.flush();
		et.commit();
		
		return sample;
	}
	public Sample getById(int id){
		try{
		Sample sample = (Sample)entityManager.createQuery("SELECT s FROM Sample s where s.id = :id").
				setParameter("id", id).getSingleResult();
		return sample;
		}catch(NoResultException e){
			
			return null;
		}
	}
	public List<Sample> getAll() throws NamingException {
		List<Sample> result = (List<Sample>)entityManager.createNamedQuery("Sample.findAll").getResultList();
		return result;
	}
}
