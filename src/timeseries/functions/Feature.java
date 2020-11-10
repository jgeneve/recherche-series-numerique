package timeseries.functions;

import java.util.ArrayList;
import java.util.List;

public class Feature {

	/**
	 * ONE: Renvoie le premier entier pour chaque tableau
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return					liste des premiers entiers pour les listes pass�es en entr�e
	 */
	public static List<Integer> one(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		for (List<Integer> resultPattern : resultsPattern) {
			results.add(resultPattern.get(0));
		}
		return results;
	}
	
	/**
	 * WIDTH: Renvoie le nombre d'entiers pour chaque tableau
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return					liste des nombres d'entiers pour les listes pass�es en entr�e
	 */
	public static List<Integer> width(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer listSize; 
		for (List<Integer> resultPattern : resultsPattern) {
			listSize = resultPattern.size();
			results.add(listSize);
		}
		
		return results;
	}
	
	/**
	 * SURF (surface): Renvoie la somme des entiers pour chaque tableau d'entiers
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return					sommes des entiers pour les listes pass�es en entr�e
	 */
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

	
	/**
	 * MAX: Renvoie l'entier le plus grand pour chaque tableau d'entiers
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return					listes des maximums pour les listes pass�es en entr�e
	 */
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
	
	
	/**
	 * MIN: Renvoie l'entier le plus petit pour chaque tableau d'entiers
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return					listes des minimums pour les listes pass�es en entr�e
	 */
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
	
	/**
	 * RANGE: Renvoie la diff�rence entre l'entier le plus grand et l'entier le plus petit pour chaque tableau d'entiers
	 * 
	 * @param resultsPattern 	la liste des listes d'entiers � analyser
	 * @return 					liste des diff�rences pour les listes
	 */
	public static List<Integer> range(List<List<Integer>> resultsPattern) {
		List<Integer> results = new ArrayList<>();
		
		Integer firstValue, lastValue;
		for (List<Integer> resultPattern : resultsPattern) {
			firstValue = resultPattern.get(0);
			lastValue = resultPattern.get(resultPattern.size()-1);
			results.add(Math.abs(firstValue - lastValue));
		}
		return results;
	}
}
