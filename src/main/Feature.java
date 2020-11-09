package main;

import java.util.ArrayList;
import java.util.List;

import com.squareup.javapoet.*;
import javax.lang.model.element.Modifier;

public class Feature {

	// ONE
	public static List<Integer> one(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		for (List<Integer> resultPattern : resultsPattern) {
			results.add(resultPattern.get(0));
		}
		return results;
	}
	
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

	// HEIGHT
//	public static List<Integer> height(List<List<Integer>> resultsPattern) {
//		List<Integer> results = new ArrayList<>();
//		Integer min, max, diff, height; 
//		
//		// Pour chaque pattern
//		for (List<Integer> resultPattern : resultsPattern) {
//			min = Integer.MAX_VALUE;
//			max = Integer.MIN_VALUE;
//			height = null;
//			
//			// Pour chaque value dans le pattern
//			for (Integer val : resultPattern) {
//				if (val > max) {
//					max = val;
//				}
//				if (val < min) {
//					min = val;
//				}
//			}
//			height = max - min;
//			results.add(height);
//		}
//		return results;
//	}
	
	// SURFACE
	// Additionne les valeurs de la serie dans le pattern
	public static List<Integer> surf(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		Integer surface; 
		
		for (List<Integer> resultPattern : resultsPattern) {
			surface = 0;
			for (Integer val : resultPattern) {
				surface = surface + val;
			}
			results.add(surface);
		}
		return results;
	}

	// MAX
	public static List<Integer> max(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer max;
		for (List<Integer> resultPattern : resultsPattern) {
			max = Integer.MIN_VALUE;
			for (int value : resultPattern) {
				if (value > max) {
					max = value;
				}
			}
			results.add(max);
		}
		return results;
	}
	
	// MIN
	public static List<Integer> min(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer min;
		for (List<Integer> resultPattern : resultsPattern) {
			min = Integer.MAX_VALUE;
			for (int value : resultPattern) {
				if (value < min) {
					min = value;
				}
			}
			results.add(min);
		}
		return results;
	}
	
	// RANGE

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
