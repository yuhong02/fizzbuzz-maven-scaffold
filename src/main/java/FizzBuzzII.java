
import java.util.*;
public class FizzBuzzII{
	public static List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<>();
		for (int i = 1;i <= n;i ++){
		String tmp = "";
		if (i % 3 != 0 && i % 5 != 0){
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
		res.add(tmp);
		tmp = "";
       }
	return res;
	}
}
