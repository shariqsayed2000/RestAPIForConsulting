package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long>{

	List<User> findByMobile(Long mobile);
}
