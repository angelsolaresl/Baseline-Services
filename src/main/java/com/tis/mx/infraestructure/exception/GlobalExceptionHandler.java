package com.tis.mx.infraestructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tis.mx.application.controller.CalculatorInputException;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalExceptionHandler.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * Bad request.
	 *
	 * @param calculatorInputException the calculator input exception
	 * @return the response entity
	 */
	@ExceptionHandler({ CalculatorInputException.class })
	public ResponseEntity<ErrorResponse> badRequest(CalculatorInputException calculatorInputException) {
		return new ResponseEntity<>(new ErrorResponse(1001, calculatorInputException.getMessage(), "input validation",
				"reenvie la peticion con valores de inversión correctos"), HttpStatus.BAD_REQUEST);
	}

	/**
	 * Internal server exception.
	 *
	 * @param serverException the server exception
	 * @return the response entity
	 */
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<ErrorResponse> internalServerException(Exception serverException) {
		return new ResponseEntity<>(new ErrorResponse(9999, serverException.getMessage(), "error interno", null),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
