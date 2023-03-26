package amazon.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import amazon.product.Entity.Product;
import amazon.product.Entity.finallBill;
import amazon.product.Service.prodctService;

@RestController
public class ProductController {
	@Autowired
	prodctService service;
	
	@RequestMapping("/{a}")
	public finallBill finalresult(@PathVariable int a){
		if(service.productAllId(a)) {
			finallBill p= service.finalresult(a);
			System.out.println(p);
			return p;
		}
		return null;
	}
	
	@GetMapping("/all")
	public List getallproduct(){
		return service.productAlldata();
	}
	@PostMapping("/insertProduct")
	public String insertdataProduct(@RequestBody List<Product> p){
		try {
			service.insertdataProduct(p);
		} catch (Exception e) {
			return "data not inserted";
		}
		return "data inserted";
	}
	@DeleteMapping("/DeleteProduct/{a}")
	public String deleteProduct(@PathVariable int a){
		try {
			service.deleteProduct(a);
		} catch (Exception e) {
			return "data not deleted";
		}
		return "deleted inserted";
	}
}
