import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		 //allMatch
		 List<Integer> numbers = Arrays.asList(10,20,30,40,51);
		 boolean allEvenNumbers = numbers.stream().allMatch(t -> t%2==0);
		 System.out.println(allEvenNumbers);
		 
		 //distinct
		 List<Integer> numbers2 = Arrays.asList(10,20,30,40,20);
		 List<Integer> distinctNumbers = numbers2.stream().distinct().collect(Collectors.toList());
		 System.out.println(distinctNumbers);
		 
		 //reduce
		 List<Integer> numbers3 = Arrays.asList(1,2,3,4,5);
		 int res = numbers3.stream().reduce(1,(a,b) -> a*b);
		 System.out.println(res);
		 
		 int[] numbers4 = {10,2,3,4};
		 Arrays.stream(numbers4);
		 
		 List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,10,50));
		 list.removeAll(Collections.singleton(10));
		 //list.removeAll(new ArrayList(Arrays.asList(10)));
		 System.out.println(list);
		 
	}

}
