package main;

import java.util.ArrayList;
import java.util.List;

public class Feature {

	public static List<Integer> width(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer listSize;
		for (List<Integer> resultPattern : resultsPattern) {
			listSize = resultPattern.size();
			results.add(listSize);
		}
		
		return results;
	}
}
