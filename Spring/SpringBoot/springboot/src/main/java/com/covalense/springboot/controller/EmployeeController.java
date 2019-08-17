package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/helllo", produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloWord() {

		return "hello world";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			bean.getOtherInfo().setInfoBean(bean);

			EmployeeInfoBean manager = bean.getManagerId();
			manager = repository.findById(manager.getId()).get();
			bean.setManagerId(manager);
			// setting the data for EmployeeAddressInfoBean
			for (EmployeeAddressInfoBean addressInfo : bean.getAddressInfoBean()) {
				addressInfo.getAddPK().setInfoBean(bean);
			}

			for (EmployeeEducationalInfoBean educationInfo : bean.getEducationalInfoBeans()) {
				educationInfo.getEducationalInfoPKBean().setInfoBean(bean);
			}

			for (EmployeeExperienceInfoBean experienceInfo : bean.getExpInfoBean()) {
				experienceInfo.getEmpPkBean().setInfoBean(bean);
			}
            //create new employee in Db
			repository.save(bean);

			response.setStatusCode(201);
			response.setMsg("Successfull");
			response.setDescription("Employee Data successfully Added");
		} else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("Employee Data not added to Db ");
		}

		return response;

	}// end of createEmployee()

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		if (repository.findById(id).get() != null) {
			EmployeeInfoBean bean =repository.findById(id).get();
			response.setStatusCode(201);
			response.setMsg("Successfull");
			response.setDescription("Employee Data found successfully ");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("Employee Data not found ");
		}
		return response;
	}// end of getEmployee()

	@GetMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		if (repository.findById(id).get() != null) {
			EmployeeInfoBean bean = repository.findById(id).get();
			repository.delete(bean);
			response.setStatusCode(201);
			response.setMsg("Successfull");
			response.setDescription("Employee Data deleted successfully ");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("Employee Data not deleted ");
			
		}
		return response;
	}// end of deleteEmployee()

	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE,
			 consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee( @RequestBody EmployeeInfoBean bean) {
		
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {
			bean.getOtherInfo().setInfoBean(bean);
	         //setting the manager id
			EmployeeInfoBean manager = bean.getManagerId();
			manager = repository.findById(manager.getId()).get();
			bean.setManagerId(manager);
			// setting the data for EmployeeAddressInfoBean
			for (EmployeeAddressInfoBean addressInfo : bean.getAddressInfoBean()) {
				addressInfo.getAddPK().setInfoBean(bean);
			}

			for (EmployeeEducationalInfoBean educationInfo : bean.getEducationalInfoBeans()) {
				educationInfo.getEducationalInfoPKBean().setInfoBean(bean);
			}

			for (EmployeeExperienceInfoBean experienceInfo : bean.getExpInfoBean()) {
				experienceInfo.getEmpPkBean().setInfoBean(bean);
			}

			repository.save(bean);

			response.setStatusCode(201);
			response.setMsg("Successfull");
			response.setDescription("Employee Data successfully updated");
		} else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("Employee Data not added to Db ");
		}

		return response;
	}// end of updateEmployee()

}// end of class
