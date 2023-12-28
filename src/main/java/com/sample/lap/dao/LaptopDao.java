package com.sample.lap.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.lap.entity.Laptop;
import com.sample.lap.repository.LaptopRepository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository laprepo;
	
	public String addLap(List<Laptop> e) {
		laprepo.saveAll(e);
		return "Created";
	}
	
	public String addLap1(Laptop e) {
		laprepo.save(e);
		return "Added 1 Value";
	}
	
	public Laptop getById(int id) {
		return laprepo.findById(id).get();
	}
	
	public List<Laptop> getAll() {
		return laprepo.findAll();
	}
	
	public String update(Laptop l) {
		laprepo.save(l);
		return "updated";
	}
	
	public String updateAll(List<Laptop> l) {
		laprepo.saveAll(l);
		return "updated all";
	}
	
	public String delById(int id) {
		laprepo.deleteById(id);
		return "deleted";
	}
	
	public List<Laptop> getPrice(int pr1,int pr2) {
		return laprepo.getPrice(pr1,pr2);
	}
	
	public List<Laptop> getLaptopByPrice(int pr) {
		return laprepo.getLaptopByPrice(pr);
	}
	
	public List<Integer> getPricel() {
		return laprepo.getPricel();
	}
	
	public List<Laptop> getPriceInDesc() {
		return laprepo.getPriceInDesc();
	}
	
	public List<Object> getBrandandPrice() {
		return laprepo.getBrandandPrice();
	}
	
	public Object getBrandModelColor(int pr) {
		return laprepo.getBrandModelColor(pr);
	}
	
}
