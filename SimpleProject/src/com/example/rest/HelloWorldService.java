package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.SampleDao;
import model.Sample;
 
@Path("/hello")
public class HelloWorldService {
	private SampleDao sampleDao;
	public HelloWorldService() throws NamingException {
		sampleDao = new SampleDao();
	}
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();
 
	}
	@GET
	@Path("/getAllSamples")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SampleDto> getAll() throws NamingException{
		List<SampleDto> result = new ArrayList<>();
		for(Sample s: sampleDao.getAll()){
			
			result.add(new SampleDto(s));
		}
		return result;
	}
 
}