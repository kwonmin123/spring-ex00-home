package org.zerock.controller.p05controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.p05controller.bean.Bean14;
import org.zerock.controller.p05controller.bean.Bean18;
import org.zerock.mapper.p05mapper.Mapper03;

import lombok.Setter;

@Controller
@RequestMapping("/cont12")
public class Controller12 {
	
	@Setter(onMethod_= @Autowired)
	private Mapper03 mapper;
	
	
	@RequestMapping("/met01")
	public void	methon01() {
		String customerName ="IRON-MAN";
		String contactName ="Avengers";
		
	 int c =mapper.insertCustomer(customerName, contactName);
	 System.out.println(c);
	}
	@RequestMapping("/met02")
	public void method02() {
		String supplierName = "ironman";
		String contactName = "tony";
		
		int cnt = mapper.insertSupplier(supplierName, contactName);
		System.out.println(cnt);
	}
	
	
	@RequestMapping("/met04")
	public void method04() {
		Bean18 bean = new Bean18();
		bean.setSupplierName("happy");
		bean.setContactName("new");
		bean.setAddress("year");
		bean.setCity("merry");
		bean.setPostalCode("christ");
		bean.setCountry("mas");
		bean.setPhone("1577-1577");
		
		int c =mapper.insertSupplier2(bean);
		System.out.println(c);
		
	}
	
	@RequestMapping("/met05")
	public void method05() {
		Bean14 bean = new Bean14();
		bean.setAddress("gang2");
		bean.setCity("name2");
		bean.setContactName("todo2");
		bean.setCountry("korea");
		bean.setCustomerName("happy3");
		bean.setPostalCode("1588-5588");
		
		System.out.println(bean.getCustomerID()); //null or0
		
		
		mapper.insertCustomer3(bean);
	 System.out.println(bean.getCustomerID());
	
	}
	
	@RequestMapping("/met06")
	public void method06() {
		Bean18  bean = new Bean18();
		bean.setSupplierName("happy2");
		bean.setContactName("new2");
		bean.setAddress("year2");
		bean.setCity("merry2");
		bean.setPostalCode("christ2");
		bean.setCountry("mas2");
		bean.setPhone("1577-15772");
	System.out.println(bean.getSupplierID());
	mapper.insertSupplier3(bean);
	System.out.println(bean.getSupplierID());
	
	}
	@RequestMapping("/met07")
	public void method07() {
		Bean14 bean = new Bean14();
		bean.setCustomerID(102);
		bean.setContactName("widow");
		bean.setCustomerName("nat");
		bean.setAddress("jongro");
		bean.setCity("dokdo");
		bean.setCountry("korea");
		bean.setPostalCode("77777");
		
		int c = mapper.updateCustomer(bean);
		System.out.println(c);
	}
	
	@RequestMapping("/met08")
	public void method08() {
		Bean18 bean = new Bean18();
		
		bean.setSupplierID(35);
		bean.setSupplierName("supplierName");
		bean.setContactName("contactName");
		bean.setAddress("address");
		bean.setCity("city");
		bean.setPhone("phone");
		bean.setPostalCode("postalCode");
		bean.setCountry("country");
		
		int c = mapper.updateSupplier(bean);
		System.out.println(c);
	}
	
	
	@RequestMapping("/met09")
	public void method09(Integer id) {
		int cnt = mapper.deleteCustomer(id);
		System.out.println(cnt);
		
	}
	
	@RequestMapping("/met10")
	public void method10(Integer id) {
		int cnt = mapper.deleteSupplier(id);
		System.out.println(cnt);
		
	}
	
	
	
}
