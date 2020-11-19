package timeseries.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import results.objects.FeatureResult;
import results.objects.PatternResult;

public class Feature {


	public static FeatureResult one(PatternResult patternResult) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = patternResult.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = patternResult.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			results.add(patternMatch.get(i).get(0));
			posResults.add(patternPosMatch.get(i).get(0));
		}
		
		return new FeatureResult(results, posResults);
	}
	
	
	public static FeatureResult width(PatternResult resultsPattern) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = resultsPattern.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = resultsPattern.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			results.add(patternMatch.get(i).size());
			posResults.add(patternPosMatch.get(i).get(0));
		}
		
		return new FeatureResult(results, posResults);
	}
	
	
	public static FeatureResult surf(PatternResult resultsPattern) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = resultsPattern.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = resultsPattern.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			Integer sum = 0;
			// Sum of value in pattern
			for (int j = 0; j < patternMatch.get(i).size(); j++) {
				sum += patternMatch.get(i).get(j);
			}
			results.add(sum);
			posResults.add(patternPosMatch.get(i).get(0));
		}
		
		return new FeatureResult(results, posResults);
	}

	
	public static FeatureResult max(PatternResult resultsPattern) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = resultsPattern.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = resultsPattern.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			Integer max = Integer.MIN_VALUE;
			Integer posMax = 0;
			// Sum of value in pattern
			for (int j = 0; j < patternMatch.get(i).size(); j++) {
				if (patternMatch.get(i).get(j) >= max) {
					max = patternMatch.get(i).get(j);
					posMax = patternPosMatch.get(i).get(j);
				}
			}
			results.add(max);
			posResults.add(posMax);
		}
		
		return new FeatureResult(results, posResults);
	}
	
	
	public static FeatureResult min(PatternResult resultsPattern) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = resultsPattern.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = resultsPattern.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			Integer min = Integer.MAX_VALUE;
			Integer posMin = 0;
			// Sum of value in pattern
			for (int j = 0; j < patternMatch.get(i).size(); j++) {
				if (patternMatch.get(i).get(j) <= min) {
					min = patternMatch.get(i).get(j);
					posMin = patternPosMatch.get(i).get(j);
				}
			}
			results.add(min);
			posResults.add(posMin);
		}
		
		return new FeatureResult(results, posResults);
	}

	
	public static FeatureResult range(PatternResult resultsPattern) {
		List<Integer> patRes = new ArrayList<Integer>();
		List<Integer> patPos = new ArrayList<Integer>();

		List<List<Integer>> patternMatch = resultsPattern.getSeriesInPattern();
		List<List<Integer>> patternPosMatch = resultsPattern.getPosSeriesInPattern();
		
		List<Integer> results = new ArrayList<>();
		List<Integer> posResults = new ArrayList<>();
		
		for (int i = 0; i < patternMatch.size(); i++) {
			Integer min = Integer.MAX_VALUE;
			Integer max = Integer.MIN_VALUE;
			
			// Sum of value in pattern
			for (int j = 0; j < patternMatch.get(i).size(); j++) {
				if (patternMatch.get(i).get(j) < min) {
					min = patternMatch.get(i).get(j);
				}
				if (patternMatch.get(i).get(j) > max) {
					max = patternMatch.get(i).get(j);
				}
			}
			results.add(max-min);
			posResults.add(patternPosMatch.get(i).get(0));
		}
		
		return new FeatureResult(results, posResults);
	}
}
