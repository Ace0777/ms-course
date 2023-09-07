package com.ace.hrworkert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.hrworkert.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
