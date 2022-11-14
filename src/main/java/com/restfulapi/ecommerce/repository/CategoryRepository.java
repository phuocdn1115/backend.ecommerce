package com.restfulapi.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
