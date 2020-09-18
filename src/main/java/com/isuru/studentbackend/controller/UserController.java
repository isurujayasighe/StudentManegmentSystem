package com.isuru.studentbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isuru.studentbackend.model.Response;
import com.isuru.studentbackend.model.User;
import com.isuru.studentbackend.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/users")
@Api(tags = "User Controller")
public class UserController {

	@Autowired
	UserService userServcie;
	
	@ApiOperation(value = "Get All User Records", notes = "Get All User records")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = String.class)})
	@GetMapping(value = "/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllUsers() {
		
		Response response = new Response();
		response.setStatus(200);
		response.setUser(userServcie.getAllUsers());
		
		return response;
	}
	
	@ApiOperation(value = "Create User Records", notes = "Create User records")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = String.class)})
    @PostMapping (value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUser (@ApiParam(required = true, name = "payload", value = "User Details") @RequestBody User payload) {
		
		userServcie.saveUser(payload);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
