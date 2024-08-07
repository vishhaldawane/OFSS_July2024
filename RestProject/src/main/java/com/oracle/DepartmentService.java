package com.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.oracle.dao.Department;
import com.oracle.dao.DepartmentDAO;
import com.oracle.dao.DepartmentDAOImpl;


@Path("/DeptService") // rest/UserService/greet
public class DepartmentService { 
	public DepartmentService(){
		System.out.println("DepartmentService() ctor");
	}
	
   @GET	
   @Path("/greet") 
   @Produces(MediaType.TEXT_HTML) 
   public String welcome(){ 
      return "<h1>Welcome to Department Service</h1>";
   }  
   
   @GET	
   @Path("/depts") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<Department> allDepts(){ 
       DepartmentDAO dao = new DepartmentDAOImpl();
	   List<Department> deptList = new ArrayList<Department>();
	   deptList = dao.readDepartments();
	   return deptList;
   }
   @GET	
   @Path("/depts/{dno}") // http://..../resources/DeptService/depts/10
   @Produces(MediaType.APPLICATION_JSON) 
   public Department deptById(@PathParam("dno") int deptno){ 
	   System.out.println("Finding department id "+deptno);
       DepartmentDAO dao = new DepartmentDAOImpl();
	   Department dept = dao.readDepartment(deptno);
	   return dept;
   }
   @POST
   @Path("/depts/add") // http://..../resources/DeptService/depts
   @Consumes(MediaType.APPLICATION_JSON) 
   public Response makeNewDept(Department deptObj){ 
	   System.out.println("Adding a new department");
       DepartmentDAO dao = new DepartmentDAOImpl();
       try {
    	   dao.createDepartment(deptObj);
    	   return Response.status(Response.Status.CREATED).entity(deptObj).build();
       }
       catch(Exception e) {
    	   return Response.status(Response.Status.NOT_ACCEPTABLE).entity(e.getMessage()).build();
   
       }
    	   //return Response.ok(deptObj, "Object inserted").build();
   }
   
   @PUT
   @Path("/depts/update") // http://..../resources/DeptService/depts
   @Consumes(MediaType.APPLICATION_JSON) 
   public Response modifyExistingDept(Department deptObj){ 
	   System.out.println("Editing a existing department");
       DepartmentDAO dao = new DepartmentDAOImpl();
	   dao.updateDepartment(deptObj);
	   return Response.status(Response.Status.OK).entity(deptObj).build();
	   //return Response.ok(deptObj, "Object inserted").build();
   }
   
   
   
   
   
}