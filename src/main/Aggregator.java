package main;

public class Aggregator {

	public static int MIN(int [] features) {
		int min = 9999999;
		for ( int feature : features) {
			if (feature < min) {
				min = feature;
			}
		}
		return min;
	}
	

	public static int MAX(int [] features) {
		int max = 0;
		for ( int feature : features) {
			if (feature > max) {
				max = feature;
			}
		}
		return max;
	}
	
}
