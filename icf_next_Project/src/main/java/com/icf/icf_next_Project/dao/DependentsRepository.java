package com.icf.icf_next_Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icf.icf_next_Project.entity.Dependents;

@Repository
public interface DependentsRepository extends JpaRepository<Dependents, Long> 
{
	
}