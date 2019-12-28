import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.Exception;

import org.junit.rules.ExpectedException;
public class FizzBuzzIITest {
    @Test
    public void FizzBuzz3(){
    	int number =3;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	assertThat(result).isEqualTo(result1);
    	
    }
    @Test
    public void FizzBuzz4(){
    	int number =4;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	assertThat(result).isEqualTo(result1);	
    }
    @Test
    public void FizzBuzz6(){
    	int number =6;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	result1.add("Buzz");
    	result1.add("Fizz");
    	assertThat(result).isEqualTo(result1);
    }

    @Test
    public void FizzBuzz5(){
    	int number =5;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	result1.add("Buzz");
    	assertThat(result).isEqualTo(result1);
    }
    @Test
    public void FizzBuzz10(){
    	int number =10;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	result1.add("Buzz");
    	result1.add("Fizz");
    	result1.add("Whizz");
    	result1.add("8");
    	result1.add("Fizz");
    	result1.add("Buzz");
    	assertThat(result).isEqualTo(result1);
    }

    @Test
    public void FizzBuzz15(){
    	int number =15;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	result1.add("Buzz");
    	result1.add("Fizz");
    	result1.add("Whizz");
    	result1.add("8");
    	result1.add("Fizz");
    	result1.add("Buzz");
    	result1.add("11");
    	result1.add("Fizz");
    	result1.add("13");
    	result1.add("Whizz");
    	result1.add("FizzBuzz");
    	assertThat(result).isEqualTo(result1);
    }
    
    @Test
    public void FizzBuzz30(){
    	int number =30;
    	List<String> result = FizzBuzzII.fizzBuzz(number);
    	List<String> result1 = new ArrayList<>();
    	result1.add("1");
    	result1.add("2");
    	result1.add("Fizz");
    	result1.add("4");
    	result1.add("Buzz");
    	result1.add("Fizz");
    	result1.add("Whizz");
    	result1.add("8");
    	result1.add("Fizz");
    	result1.add("Buzz");
    	result1.add("11");
    	result1.add("Fizz");
    	result1.add("13");
    	result1.add("Whizz");
    	result1.add("FizzBuzz");
    	result1.add("16");
    	result1.add("17");
    	result1.add("Fizz");
    	result1.add("19");
    	result1.add("Buzz");
    	result1.add("FizzWhizz");
    	result1.add("22");
    	result1.add("23");
    	result1.add("Fizz");
    	result1.add("Buzz");
    	result1.add("26");
    	result1.add("Fizz");
    	result1.add("Whizz");
    	result1.add("29");
    	result1.add("FizzBuzz");
    	assertThat(result).isEqualTo(result1);
    }    	
    @Rule 
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void exception(){
    	expectedException.expect(IllegalArgumentException.class);
    	expectedException.expectMessage("Invalid input");
    	int number =-1;
    	FizzBuzzII.fizzBuzz(number);
    }
}
