package com.oracle.project.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.project.layer2.IndianRailwayTicket;

@Repository
public interface TicketRepository extends CrudRepository<IndianRailwayTicket, Integer> {

}
