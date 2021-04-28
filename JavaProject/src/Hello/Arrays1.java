package Hello;

import java.util.Arrays;

public class Arrays1 {

	void printArray() {
		String[] arrayOne= {"b","c","d"};
		
//		for(String s:arrayOne)
//		{
//			System.out.println(s);
//		}
		
		Arrays.stream(arrayOne).forEach(temp->{
			System.out.println(temp);
		});
	}
}
