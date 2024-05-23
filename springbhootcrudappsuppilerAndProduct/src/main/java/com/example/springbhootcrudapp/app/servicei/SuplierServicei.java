package com.example.springbhootcrudapp.app.servicei;

import java.util.List;
import java.util.Optional;

import com.example.springbhootcrudapp.app.model.Suplier;


public interface SuplierServicei {

	Suplier saveSuplier(Suplier s);

	List<Suplier> getSuppliers();

	Optional<Suplier> getSuppliersById(int supplierId);

	Suplier updateSuplier(int supplierId, Suplier s);

	void deleteSuplier(int supplierId);


}
