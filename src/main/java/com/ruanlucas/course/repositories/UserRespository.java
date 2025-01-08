package com.ruanlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanlucas.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
