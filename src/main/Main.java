package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TEST PEAK REGEX
		List<Integer> serie = Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1);
		Integer result = min_width_peak(serie);		
		System.out.println(result);
	}
	
	
	//TODO remove
	public static Integer min_width_peak(List<Integer> serie) {
		List<List<Integer>> resultsPattern = applyPattern(Patterns.PEAK, serie);
		List<Integer> resultsFeature = Feature.width(resultsPattern);
		Integer resultAggregator = Aggregator.min(resultsFeature);
		return resultAggregator;
	}
	
	
	
	public static List<List<Integer>> applyPattern(Patterns pattern, List<Integer> serie) {
		// On transforme la liste d'integer en signature
		String sig = getSignature(serie);
		
		Pattern p = Pattern.compile(pattern.getRegex());
		Matcher matcher = p.matcher(sig);

		List<List<Integer>> results = new ArrayList<List<Integer>>();
		// Pour chaque pattern trouv� dans la s�rie
		while(matcher.find()) {
			// On r�cup�re la position du premier / dernier �l�ment du pattern dans la s�rie
			int start = matcher.start();
			int end = matcher.end();
			// On r�cup�re l'offset de d�part / fin correspondant � la d�finition du pattern
			int patternStartOffset = pattern.getStart();
			int patternEndOffset = pattern.getEnd();
			
			// On r�cup�re la sous-s�rie N trouv� par le regex en applicant les offsets
			List<Integer> sublist = serie.subList(start+patternStartOffset, end-patternEndOffset+1); // +1 car le param�tre de fin de sublist est EXCLUSIF
			results.add(sublist);
		}
		return results;
	}

    public static String getSignature(List<Integer> serie) {
        String res = "";
        for (int i = 1; i < serie.size(); i++) {
            if (serie.get(i - 1) > serie.get(i)) {
                res += ">";
            } else if (serie.get(i - 1) < serie.get(i)) {
                res += "<";
            } else {
                res += "=";
            }
        }
        return res;
    }


}
