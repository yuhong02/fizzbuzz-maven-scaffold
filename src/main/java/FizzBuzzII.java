
import java.util.*;
public class FizzBuzzII{
	public static List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<>();
		if(n<=0){
			throw new IllegalArgumentException("Invalid input");
		}
		for (int i = 1;i <= n;i ++){
		String tmp = "";
		if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
		 tmp += i;
		 res.add(tmp);
		tmp = "";
		continue;
		}
		if (i % 3 == 0){
		 tmp += "Fizz";
		}
		if (i % 5 == 0){
		tmp += "Buzz";
		}
		if (i % 7 == 0){
		tmp += "Whizz";
		}
		res.add(tmp);
		tmp = "";
       }
	return res;
	}
}
