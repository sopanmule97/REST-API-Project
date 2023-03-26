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

import amazon.product.Entity.Tax;
import amazon.product.Service.TaxService;

@RestController
public class TaxController {
	
	@Autowired
	TaxService service;
	
	@PostMapping("/chrgeinsert")
	public void inserttaxes(@RequestBody List<Tax> t) {
	System.out.println(t);
		service.inserttaxes(t);
	}
	@DeleteMapping("/chrgesdelete")
	public String deletechrges(@RequestBody char[] c) {
		try {
			String s=  new String(c);
			System.out.println(s);
			service.deletechrges(s);
		} catch (Exception e) {
			return "not delete";
		}
		return "sucessfully delete";
	}
	@GetMapping("/chrgeall")
	public List fetch() {
		return service.fetch();
	}
	
}
