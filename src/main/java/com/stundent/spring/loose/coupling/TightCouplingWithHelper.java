package com.stundent.spring.loose.coupling;

/**
 * This looks more elegant, and you only need to manage a single helper class,
 * however the helper class is still tightly coupled to CsvOutputGenerator,
 * every change of output generator still involves minor code change.
 * 
 * @author aayushraj
 *
 */
public class TightCouplingWithHelper {
	public static void main(String[] args) {
		OutputHelper output = new OutputHelper();
		output.generateOutput();
	}
}