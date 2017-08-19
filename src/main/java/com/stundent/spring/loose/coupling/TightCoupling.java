package com.stundent.spring.loose.coupling;

/**
 * Problem In this way, the problem is the “output” is coupled tightly to
 * CsvOutputGenerator, every change of output generator may involve code change.
 * If this code is scattered all over of your project, every change of the
 * output generator will make you suffer seriously.
 * 
 * 
 * @author aayushraj
 *
 */
public class TightCoupling {
	public static void main(String[] args) {
		IOutputGenerator output = new CsvOutputGenerator();
		output.generateOutput();

		output = new JsonOutputGenerator();
		output.generateOutput();
	}
}