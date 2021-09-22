package com.tis.mx.infraestructure.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * Sets the more info.
 *
 * @param moreInfo the new more info
 */
@Setter

/**
 * Gets the more info.
 *
 * @return the more info
 */
@Getter

/**
 * Instantiates a new error response.
 *
 * @param code the code
 * @param message the message
 * @param location the location
 * @param moreInfo the more info
 */
@AllArgsConstructor
public class ErrorResponse {

	/** The code. */
	private Integer code;
	
	/** The message. */
	private String message;
	
	/** The location. */
	private String location;
	
	/** The more info. */
	private String moreInfo;

}
