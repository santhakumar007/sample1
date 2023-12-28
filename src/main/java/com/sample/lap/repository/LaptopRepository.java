package com.sample.lap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sample.lap.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop,Integer>{
	
	@Query(value = "select l from Laptop l where l.price >= :pr1 and l.price <= :pr2")
	public List<Laptop> getPrice(@Param("pr1") int pr1, @Param("pr2") int pr2);
	
	@Query(value ="select l from Laptop l where l.price >=:pr")
	public List<Laptop> getLaptopByPrice(@Param("pr") int pr);

	@Query(value ="select l.price from Laptop l")
	public List<Integer> getPricel();
	
	@Query(value ="select l from Laptop l order by l.price desc")
	public List<Laptop> getPriceInDesc();
	
	@Query(value ="select l.brand,l.price from Laptop l")
	public List<Object> getBrandandPrice();
	
	@Query(value ="select l.brand,l.model,l.color from Laptop l where l.price <= :pr")
	public Object getBrandModelColor(@Param("pr") int pr);

}
