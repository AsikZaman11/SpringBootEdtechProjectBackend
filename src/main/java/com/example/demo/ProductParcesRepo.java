package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductParcesRepo extends JpaRepository<ProductParces, Integer> {

	@Query(value="SELECT max(id) FROM product_parces", nativeQuery = true)
	public int getRev();
	@Query(value="SELECT sum(total) FROM product_parces", nativeQuery = true)
	public int getRevenue();
	@Query("SELECT sum(id) FROM ProductParces u WHERE u.name =:startdate")
    public int total (@Param("startdate") int total);
	
	@Query("select u From ProductParces u WHERE u.date =:d ")
	public List<ProductParces> getUserByRevenue(@Param("d")String date);
	
	@Query("SELECT sum(total) FROM ProductParces u WHERE u.name =:startdate")
    public int totalbyday (@Param("startdate") int total);
	
}
