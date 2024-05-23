 package com.example.springbhootcrudapp.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.springbhootcrudapp.app.model.Suplier;
import com.example.springbhootcrudapp.app.servicei.SuplierServicei;
@CrossOrigin("*")
@RestController
@RequestMapping("/suplier")
public class SupplierController 
{
	@Autowired
	SuplierServicei sri;
	
	@PostMapping("/suplier")
	public Suplier saveSuplier(@RequestBody Suplier s )
	{
		Suplier suplier=sri.saveSuplier(s);
		return s;
		
	}
	@GetMapping("/supliers")
	public List<Suplier> getSuppliers()
	{
		 List<Suplier> sList=sri.getSuppliers();
		return sList;
		
	}
	@GetMapping("/suplier/{supplierId}")
	public  Optional<Suplier> getSuppliersById(@PathVariable Integer supplierId)
	{
	Optional<Suplier> suplier=sri.getSuppliersById(supplierId);
	  return suplier;
	}
	
	@PutMapping("/suplier/{supplierId}")
	public Suplier updateSuplier(@PathVariable Integer supplierId,@RequestBody Suplier s)
	{
		Suplier suplier= sri.updateSuplier(supplierId,s);
		return suplier;
	}
	@DeleteMapping("/suplier/{supplierId}")
	public void deleteSuplier(@PathVariable Integer supplierId )
	{
		sri.deleteSuplier(supplierId);
	}
	
	

}
