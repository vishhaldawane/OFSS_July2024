package com.oracle.project.layer3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.project.layer2.IndianRailwayTicket;

@Repository			//Department ->DepartmentDAO->DepartmentDAOImpl
public interface TicketRepository extends CrudRepository<IndianRailwayTicket, Integer> {

}
//now spring would provide the implementation
//of TicketRepository interface
//as SimpleCrudRepository
