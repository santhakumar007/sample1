package com.sample.lap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sample.lap.dao.LaptopDao;
import com.sample.lap.entity.Laptop;

@Service
public class LaptopService {
	@Autowired
	LaptopDao lapdao;
	
	public String addLap(List<Laptop> e ) {
		return lapdao.addLap(e);
	}
	
	public String addLap1(Laptop e) {
		return lapdao.addLap1(e);
	}
	
	public Laptop getById(int id) {
		return lapdao.getById(id);
	}
	
	public List<Laptop> getAll() {
		return lapdao.getAll();
	}
	
	public String update(Laptop l) {
		return lapdao.update(l);
	}
	
	public String updateAll(List<Laptop> l) {
		return lapdao.updateAll(l);
	}
	
	public String delById(int id) {
		return lapdao.delById(id);
	}
	
	public List<Laptop> getPrice(int pr1,int pr2) {
		return lapdao.getPrice(pr1,pr2);
	}
	
	public List<Laptop> getLaptopByPrice(int pr) {
		return lapdao.getLaptopByPrice(pr);
	}
	
	public List<Integer> getPricel() {
		return lapdao.getPricel();
	}
	
	public List<Laptop> getPriceInDesc() {
		return lapdao.getPriceInDesc();
	}
	
	public List<Object> getBrandandPrice() {
		return lapdao.getBrandandPrice();
	}
	
	public Object getBrandModelColor(int pr) {
		return lapdao.getBrandModelColor(pr);
	}
}
