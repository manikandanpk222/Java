package lambda;

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class streamapi {

		public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana", "cherry", "dates", "grape");
		Stream<String> s1=list.stream();
			// Intermediate operations
		//s1.filter(s -> s.startsWith("a")).forEach(System.out::println);
			
	     //  s1.map(String::length).forEach(System.out::println);
	     // s1.flatMap(s -> Stream.of(s.split(""))).forEach(System.out::println);
			
	        // s1.distinct().forEach(System.out::println);
			
	 	//s1.sorted().forEach(System.out::println);
			
		//s1.limit(2).forEach(System.out::println);
			
	      //    s1.skip(2).forEach(System.out::println);

	 
	             	// Terminal operations
			//s1.forEach(System.out::println);
		//long count = s1.count();
			
		//	List<String> collectedList = list.stream().collect(Collectors.toList());
		//	System.out.println(collectedList);
		//	Optional<String> reducedString = list.stream().reduce((s3, s2) -> s3 + "-" + s2);
		//	System.out.println(reducedString);
			
		//	Optional<String> minString = list.stream().min(Comparator.naturalOrder());
		//	System.out.println(minString);
		//	boolean anyMatch = list.stream().anyMatch(s -> s.startsWith("a"));
		//	System.out.println(anyMatch);
		//Optional<String> first = list.stream().findFirst();
	          //     System.out.println(first);
		System.out.println("---------ENDS");
		}

	}


