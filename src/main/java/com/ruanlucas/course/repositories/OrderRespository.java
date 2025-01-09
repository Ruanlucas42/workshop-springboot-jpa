package com.ruanlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.course.entities.Order;

public interface OrderRespository extends JpaRepository<Order, Long>{

}
