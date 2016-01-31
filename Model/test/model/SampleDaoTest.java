package model;

import static org.junit.Assert.*;

import java.util.List;

import javax.naming.NamingException;

import org.junit.Test;

import dao.SampleDao;

public class SampleDaoTest {
	@Test
	public void testFindById() throws NamingException{
		SampleDao sampleDao = new SampleDao();
		Sample sample = sampleDao.getById(100);
		sample = new Sample();
		sample.setText("XXX");
		//sample.setText("This is the another motherfucking text"); 
		sample=sampleDao.create(sample);
		System.out.println(sample.getText());
	}
//@Test
	public void testCreate() throws NamingException{
	SampleDao sampleDao = new SampleDao();
	Sample sample = new Sample();
	sample.setText("some Text");
	sample = sampleDao.create(sample);
	System.out.println(sample.getId());
}
	//@Test
	public void test() throws NamingException {
		SampleDao sampleDao = new SampleDao();
		List<Sample> result = sampleDao.getAll();
		for(Sample s: result){
			System.out.println(s.getText()+" "+s.getId());
		}
		System.out.println(result.size());
	}

}
