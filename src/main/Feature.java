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
	
}
