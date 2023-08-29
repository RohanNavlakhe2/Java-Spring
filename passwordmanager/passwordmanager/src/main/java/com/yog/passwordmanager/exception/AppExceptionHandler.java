package com.yog.passwordmanager.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.yog.passwordmanager.paylod.responses.AppResponse;


@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<AppResponse<Object>> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
	  return new ResponseEntity(
				new AppResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage(), null),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(UserAlreadyExistsException.class)
	public final ResponseEntity<AppResponse<Object>> handleUserAlreadyExistsException(Exception ex, 
			WebRequest request) throws Exception{
		return new ResponseEntity(
				new AppResponse(HttpStatus.CONFLICT.value(),ex.getMessage(), null),
				HttpStatus.CONFLICT);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		 
		return new ResponseEntity(
				new AppResponse(status.value(),ex.getMessage(), null),
				status);
	}
	
	

}
