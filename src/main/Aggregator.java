package main;

import java.util.List;

public class Aggregator {
	
	public static Integer min(List<Integer> features) {
		int min = Integer.MAX_VALUE;
		for ( int feature : features) {
			if (feature < min) {
				min = feature;
			}
		}
		return min;
	}
	

	public static Integer max(List<Integer> features) {
		int max = Integer.MIN_VALUE;
		for ( int feature : features) {
			if (feature > max) {
				max = feature;
			}
		}
		return max;
	}
	
}
