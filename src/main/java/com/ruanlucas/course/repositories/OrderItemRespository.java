package com.ruanlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.course.entities.OrderItem;
import com.ruanlucas.course.entities.pk.OrderItemPK;

public interface OrderItemRespository extends JpaRepository<OrderItem, OrderItemPK> {

}
