package com.covalense.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.ResponseData;
import com.covalense.lms.dto.UserBean;
import com.covalense.lms.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData login(int id, String password, HttpServletRequest request) {

		ResponseData userResponse = new ResponseData();

		UserBean bean = userRepository.findById(id).get();
		if (bean != null && bean.getPassword().equals(password)) {
			userResponse.setStatusCode(201);
			userResponse.setMsg("Succesfull");
			userResponse.setDescription("Logged Sucessfull");
			userResponse.setUserBean(Arrays.asList(bean));
			request.getSession(true).setAttribute("bean", bean);
		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("Failure");
			userResponse.setDescription("Invalid Credencials");
		}
		return userResponse;

	}// end of login

	@PostMapping(path = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData createUserAccount(@RequestBody UserBean userBean) {

		ResponseData userResponse = new ResponseData();
		if (!userRepository.existsById(userBean.getId())) {
			// creating new user into Db
			userRepository.save(userBean);
			userResponse.setStatusCode(201);
			userResponse.setMsg("Successfull");
			userResponse.setDescription("User Data successfully Added");

		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("failed");
			userResponse.setDescription("User Data is already exist ");
		}

		return userResponse;
	}// end of create()

	@PostMapping(path = "/updateUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData updateUserAccount(@RequestBody UserBean userBean) {

		ResponseData userResponse = new ResponseData();
		if (userRepository.existsById(userBean.getId())) {
			// creating new user into Db
			userRepository.save(userBean);
			userResponse.setStatusCode(201);
			userResponse.setMsg("Successfull");
			userResponse.setDescription("User Data updated successfully ");

		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("failed");
			userResponse.setDescription("User Data is not  exist ");
		}
		return userResponse;
	}// end of updateUserAccount()

	@GetMapping(path = "/deleteUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData deleteUser(int id) {

		ResponseData userResponse = new ResponseData();
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			userResponse.setStatusCode(201);
			userResponse.setMsg("Successfull");
			userResponse.setDescription("User Data deleted successfully ");
		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("failed");
			userResponse.setDescription("User Data not present ");
		}
		return userResponse;
	}// end of deleteUser()

	@GetMapping(path = "/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData getUserById(int id) {

		ResponseData userResponse = new ResponseData();

		if (userRepository.existsById(id)) {
			UserBean bean = userRepository.findById(id).get();
			userResponse.setStatusCode(201);
			userResponse.setMsg("Succesfull");
			userResponse.setDescription("User found");
			userResponse.setUserBean(Arrays.asList(bean));

		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("Failure");
			userResponse.setDescription("User not found");
		}
		return userResponse;

	}// end of getUserById()
	@GetMapping(path = "/getUserByName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData getUserByName(String name) {

		ResponseData userResponse = new ResponseData();

		if (userRepository.existsByName(name)) {
			UserBean bean = userRepository.findByName(name);
			userResponse.setStatusCode(201);
			userResponse.setMsg("Succesfull");
			userResponse.setDescription("User found");
			userResponse.setUserBean(Arrays.asList(bean));

		} else {
			userResponse.setStatusCode(401);
			userResponse.setMsg("Failure");
			userResponse.setDescription("User not found");
		}
		return userResponse;

	}// end of getUserById()

	@GetMapping(path = "/getAllUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData getUserById() {

		ResponseData userResponse = new ResponseData();
		userResponse.setStatusCode(201);
		userResponse.setMsg("Succesfull");
		userResponse.setDescription("User found");
		userResponse.setUserBean(userRepository.findAll());

		return userResponse;

	}// end of getUserById()

}
