package timeseries.functions;

import java.util.ArrayList;
import java.util.List;

import results.objects.AggregatorResult;
import results.objects.FeatureResult;

public class Aggregator {
	
	public static AggregatorResult min(FeatureResult features) {

		List<Integer> searchIn = features.getSeriesInFeature();
		List<Integer> searchIdx = features.getPosSeriesInFeature();
		
		int min = Integer.MAX_VALUE;
	
		// Find min
		for ( int i = 0; i < searchIn.size(); i++) {
			if (searchIn.get(i) < min) {
				min = searchIn.get(i);
			}
		}
		
		// Remplissage du tableau de positions des min
		List<Integer> positions = new ArrayList<Integer>();
		for (int i = 0; i < searchIn.size(); i++) {
			if (searchIn.get(i) == min) {
				positions.add(searchIdx.get(i));
			}
		}
		
		return new AggregatorResult(min, positions);
	}
	

	public static AggregatorResult max(FeatureResult features) {
		List<Integer> searchIn = features.getSeriesInFeature();
		List<Integer> searchIdx = features.getPosSeriesInFeature();
		System.out.println("searchIn: " + searchIn);
		System.out.println("searchIdx: " + searchIdx);
		
		int max = Integer.MIN_VALUE;
//		1343   2341
		// Find max
		for ( int i = 0; i < searchIn.size(); i++) {
			if (searchIn.get(i) > max) {
				max = searchIn.get(i);
			}
		}
		
		// Remplissage du tableau de positions des max
		List<Integer> positions = new ArrayList<Integer>();
		for (int i = 0; i < searchIn.size(); i++) {
			if (searchIn.get(i) == max) {
				positions.add(searchIdx.get(i));
			}
		}
		
		return new AggregatorResult(max, positions);
	}
}
