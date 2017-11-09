package hyoungki.template;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import hyoungki.learningtest.Calculator;

public class CalcSumTest {
	
	Calculator	calculator;
	String		numFilepath;
	
	@Before
	public void setUp() {
		calculator	= new Calculator();
		numFilepath	= getClass().getResource("numbers.txt").getPath();
	}

	@Test
	public void sumOfNumbers() throws IOException{
		
		assertThat(calculator.calcSum(this.numFilepath), equalTo(10));
	}
	
	@Test
	public void multyOfNumbers() throws IOException{
		
		assertThat(calculator.calcMultiply(this.numFilepath), equalTo(24));
	}
}
