package com.example.springbhootcrudapp.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbhootcrudapp.app.model.Product;
import com.example.springbhootcrudapp.app.model.Suplier;
import com.example.springbhootcrudapp.app.repositoryi.SupplierRepository;
import com.example.springbhootcrudapp.app.servicei.SuplierServicei;

@Service
public class SupplierServiceImple  implements SuplierServicei 
{
  @Autowired 
  SupplierRepository sr;
	@Override
	public Suplier saveSuplier(Suplier s) {
	
		return sr.save(s) ;
	}
	@Override
	public List<Suplier> getSuppliers() {
	{
			
			return sr.findAll();
		}
	

	}
	@Override
	public Optional<Suplier> getSuppliersById(int supplierId) {
		
		return sr.findById(supplierId);
	}
	@Override
	public Suplier updateSuplier(int supplierId, Suplier s)
	{
	      return sr.save(s);
	}
	@Override
	public void deleteSuplier(int supplierId) {
		sr.deleteById(supplierId);
		
	}
	

}
