package com.shana.exception;

public class ShanaInputParameterIsNullException extends ShanaException{

	public ShanaInputParameterIsNullException(String inputParamName) {
		super("input_parameter_is_null","The input parameter "+inputParamName+" is null.", null);
		// TODO Auto-generated constructor stub
	}

}
