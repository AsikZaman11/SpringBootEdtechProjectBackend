package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
@Query("SELECT u FROM Admin u WHERE u.email=:mail AND u.password=:pass")
public List<Admin> getAdminByName(@Param("mail")String ma, @Param("pass")String pa);
}
