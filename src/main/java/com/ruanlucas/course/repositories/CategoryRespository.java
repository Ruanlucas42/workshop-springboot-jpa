package com.ruanlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.course.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{

}
