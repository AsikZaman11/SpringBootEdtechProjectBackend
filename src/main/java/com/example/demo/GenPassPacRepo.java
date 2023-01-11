package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenPassPacRepo extends JpaRepository<GenPassPac, Integer> {
	public GenPassPac findByEmail(String email);
}
