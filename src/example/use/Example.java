package example.use;

import java.util.Arrays;
import java.util.List;

import results.objects.AggregatorResult;
import timeseries.constraints.TimeSeriesConstraints;

public class Example {

	public static void main(String[] args) {
		
		// Donnée de température heure par heure à annecy le 20/11/2020
		List<Integer> tempData = Arrays.asList(4,4,4,4,4,4,4,4,5,5,6,7,7,7,7,7,7,6,6,5,5,4,3,3);

		Integer tempMax = TimeSeriesConstraints.max_max_peak(tempData);
		Integer tempIncreaseByH = TimeSeriesConstraints.max_range_increasing(tempData);
		List<Integer> periodeChaude = TimeSeriesConstraints.pos_max_max_steady(tempData).getPositions();
		List<Integer> periodeFroide = TimeSeriesConstraints.pos_min_min_steady(tempData).getPositions();
		

		System.out.println("=====================================================");
		System.out.println("La série suivante indique les température heure par heure à annecy le 20/11/2020: " + tempData.toString());
		System.out.println("Température max de la journée: " + tempMax + "°c");
		System.out.println("Au maximum, on gagnera: " + tempIncreaseByH + "°c en une heure");
		System.out.println("Les heures ou la temperature est a son maximum dans la journée: " + periodeChaude + " H");

	}

}
