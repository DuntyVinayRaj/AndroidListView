package com.cc.calculator;

import java.io.Serializable;

public class Result implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186922881102553057L;
	int input1, input2;
	
	int add ()
	{
		return input1 + input2;
	}
	
}
