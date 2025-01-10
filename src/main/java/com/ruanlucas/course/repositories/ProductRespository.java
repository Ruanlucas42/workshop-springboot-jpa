package com.ruanlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.course.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

}
