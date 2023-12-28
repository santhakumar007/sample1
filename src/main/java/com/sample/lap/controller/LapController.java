package com.sample.lap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.lap.entity.Laptop;
import com.sample.lap.service.LaptopService;

@RestController
@RequestMapping(value="/lap")
public class LapController {
	@Autowired
	LaptopService lapser;
	
	@PostMapping(value = "/create1")
	public String addLap1(@RequestBody Laptop e ) {
		return lapser.addLap1(e);
	}
	
	@PutMapping(value = "/create")
	public String addLap(@RequestBody List<Laptop> e ) {
		return lapser.addLap(e);
	}
	
	@GetMapping(value = "/getById/{id}")
	public Laptop getById(@PathVariable int id) {
		return lapser.getById(id);
	}
	
	@GetMapping(value = "/getAll")
	public List<Laptop> getAll() {
		return lapser.getAll();
	}
	
	@PutMapping(value = "/update")
	public String update(@RequestBody Laptop l) {
		return lapser.update(l);
	}
	
	@PostMapping(value = "/updateAll")
	public String updateAll(@RequestBody List<Laptop> l) {
		return lapser.updateAll(l);
	}
	
	@DeleteMapping(value = "/delById/{id}")
	public String delById(@PathVariable int id) {
		return lapser.delById(id);
	}
	
	@GetMapping(value = "/getPrice/{pr1}/{pr2}")
	public List<Laptop> getPrice(@PathVariable int pr1, @PathVariable int pr2) {
		return lapser.getPrice(pr1,pr2);
	}
	
	@GetMapping(value = "/getLapPrice/{pr}")
	public List<Laptop> getLaptopByPrice(@PathVariable int pr) {
		return lapser.getLaptopByPrice(pr);
	}
	
	@GetMapping(value = "/getPriceAll")
	public List<Integer> getPricel() {
		return lapser.getPricel();
	}
	
	@GetMapping(value = "/getPriceInDesc")
	public List<Laptop> getPriceInDesc() {
		return lapser.getPriceInDesc();
	}
	
	@GetMapping(value = "/getNameandPrice")
	public List<Object> getBrandandPrice() {
		return lapser.getBrandandPrice();
	}
	
	@GetMapping(value = "/GetBrandModelColor/{pr}")
	public Object getBrandModelColor(@PathVariable int pr) {
		return lapser.getBrandModelColor(pr);
	}
	
}
