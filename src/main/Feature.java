package main;

import java.util.ArrayList;
import java.util.List;

public class Feature {

	// WIDTH
	public static List<Integer> width(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer listSize;
		for (List<Integer> resultPattern : resultsPattern) {
			listSize = resultPattern.size();
			results.add(listSize);
		}
		
		return results;
	}
	
	// MIN
	public static List<Integer> min(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer min;
		for (List<Integer> serieInPattern : resultsPattern) {
			min = Integer.MAX_VALUE;
			for (int value : serieInPattern) {
				if (value < min) {
					min = value;
				}
			}
			results.add(min);
		}
		return results;
	}
	
	// MAX
	public static List<Integer> max(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer max;
		for (List<Integer> serieInPattern : resultsPattern) {
			max = Integer.MIN_VALUE;
			for (int value : serieInPattern) {
				if (value > max) {
					max = value;
				}
			}
			results.add(max);
		}
		return results;
	}
	
	// ONE
	public static List<Integer> one(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		for (List<Integer> serieInPattern : resultsPattern) {
			results.add(serieInPattern.get(0));
		}
		return results;
	}

	// RANGE
	// HEIGHT

	// SURF - Attention surf doit prendre en compte une donnée du offset END
//	public static List<Integer> surf(List<List<Integer>> resultsPattern) {
//		List<Integer> surfResult = new ArrayList<>();
//		
//		Integer surf;
//		for (List<Integer> serieInPattern : resultsPattern) {
//			surf = 0;
//			for (int value : serieInPattern) {
//				surf = surf + value;
//			}
//			surfResult.add(surf);
//		}
//		return surfResult;
//	}
	
}
