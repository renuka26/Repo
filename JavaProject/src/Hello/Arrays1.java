package Hello;

import java.util.Arrays;

public class Arrays1 {

	void printArray() {
		String[] arrayOne= {"b","a","d","a"};
		
		System.out.println("Hello world ONLY IN BRANCH ONE");
		for(String s:arrayOne)
		{
			System.out.println(s);
		}
		
		Arrays.stream(arrayOne).forEach(temp->{
			System.out.println(temp);
		});
	}
}
