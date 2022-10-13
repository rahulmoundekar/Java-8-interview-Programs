package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith_34 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Brillio");
		words.add("Infosys");
		words.add("BNT");
		words.add("LNT");
		words.add("Lantra");
		words.add("TechM");

		words.stream().filter(w -> w.startsWith("B")).collect(Collectors.toList()).forEach(System.out::println);

	}

}
