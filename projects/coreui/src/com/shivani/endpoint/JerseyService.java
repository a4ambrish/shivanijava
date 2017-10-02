package com.shivani.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
  

///   http://localhost:8080/coreui/endpoint/message
@Path("/message")
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
    
    
    // localhost:3322/coreui/endpoint/message/add/20/40
    @GET
    @Path("/add/{x}/{y}")
    public String getMsg(@PathParam("x") int x,@PathParam("y") int y )
    {
         return "Hello World !! - Jersey 2 Sum is "+(x+y);
    }
    
    @GET
    @Path("/sub")
    public String getSubtraction(@QueryParam("x") int x,@QueryParam("y") int y )
    {
         return "Hello World !! - Jersey 2 Sum is "+(x-y);
    }
    
    @POST
    @Path("/mul")
    public String getMultiply(@FormParam("x") int x,@FormParam("y") int y )
    {
         return "Hello World !! - Jersey 2 Sum is "+(x*y);
    }
    
    @POST
    @Path("/employee/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public String addEmployee(Employee emp )
    {
         return "Client want to add following details ---  "+emp.toString();
    }
    
    
    @GET
    @Path("/employee/{empId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empId") String empId )
    {
    	
    	Employee emp1 = new Employee();
    	Employee emp2 = new Employee();
    	Employee result = null;
    	emp1.setDeptName("Marketing");
    	emp1.setEmpId("1");
    	emp1.setEmpName("ABC");
    	emp1.setSalary(40000);
    	
    	
    	emp2.setDeptName("IT");
    	emp2.setEmpId("2");
    	emp2.setEmpName("XYZ");
    	emp2.setSalary(80000);
    	
    	if(empId.equalsIgnoreCase("1")){
    		result = emp1;
    		
    	}
    	
    	if(empId.equalsIgnoreCase("2")){
    		result = emp2;
    		
    	}
    	
         return result;
    }
    
}