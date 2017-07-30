package com.stundent.spring.loose.coupling;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public OutputHelper() {
		outputGenerator = new CsvOutputGenerator();
	}

	public void generateOutput() {
		outputGenerator.generateOutput();
	}
}