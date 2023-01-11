package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GeneratedPasswordRepo extends JpaRepository<GeneratedPassword, Integer> {

//	@Query("Select u FROM generatedpassword u where u.email =:mail AND u.password=:pass")
//	public List<GeneratedPassword> getPass(@Param("mail")String email, @Param("pass") String pass);

	public GeneratedPassword findByEmail(String email);
	
	@Query("select u From GeneratedPassword u WHERE u.enddate =:d ")
	public List<GeneratedPassword> getEndDate(@Param("d")String date);
}
