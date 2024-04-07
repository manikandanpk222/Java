package lambda;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Stream;

	public class StreamClass {

		public static void main(String[] args) {
			//define the list on which stream to be applied
			
			List<Integer> num=Arrays.asList(6, 5, 8, 9, 7, 6);
			
			
			//Stream Syntax
			Stream<Integer> obj = num.stream();
			
							
			obj.distinct().forEach(System.out::println);
			
			
			

		}

	}

