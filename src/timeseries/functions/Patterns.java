package timeseries.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import results.objects.PatternResult;
import timeseries.enums.PatternsEnum;

public class Patterns { 
	
	public static PatternResult applyPattern(PatternsEnum pattern, List<Integer> serie) {
		// On transforme la liste d'integer en signature
		String sig = getSignature(serie);
		
		Pattern p = Pattern.compile(pattern.getRegex());
		Matcher matcher = p.matcher(sig);

		System.out.println("====> " + pattern.getName());
		System.out.println(serie.toString());
		System.out.println(sig.toString());
		
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<List<Integer>> posResults = new ArrayList<List<Integer>>();
		List<Integer> indexes = genIndexes(serie.size());
		
		// Pour chaque pattern trouvé dans la série
		int i =0;
		while(matcher.find(i)) {
			// On récupère la position du premier / dernier élément du pattern dans la série et on ajoute l'offset de départ / fin correspondant à la définition du pattern
			int start = matcher.start();
			int b = pattern.getStart();
			int end = matcher.end();
			int a = pattern.getEnd();

			// S-OCCURENCE (i..j) - Identifies the occurence opf the pattern in a signature seq
			System.out.println("s-occ: [" + start + "," + (end-1) + "] --> " + sig.subSequence(start, (end)));
			
			// I-OCCURENCE (⚫) [(i + b)..j] - Identifies an occurence of a pattern in an input seq
			System.out.println("i-occ: [" + (start+b) + "," + (end-1) + "] --> " + serie.subList(start + b, end) + "]");
			
			// E-OCCURENCE (⚫⚪) [[(i + b)..(j + 1 - a)]] - Used for computing the feature value of a pattern occurence
			System.out.println("e-occ: [" + (start+b) + "," + (end+1-a-1) + "] --> " + serie.subList(start + b, end + 1 - a) + "]");

			
			// On récupère la sous-série N trouvé par le regex en applicant les offsets
			List<Integer> sublist = serie.subList(start + b, end + 1 - a); // +1 car le paramètre de fin de sublist est EXCLUSIF
			
//			System.out.println(pattern.getName() + " : PatternPos: [" + start + "," + (end) + "]" + " --> "+ sublist.toString());
			
			results.add(sublist);
			posResults.add(indexes.subList(start + b, end + 1 - a));
			i = matcher.end() - b;
		}
		
		
		return new PatternResult(results, posResults);
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
	
	private static List<Integer> genIndexes(Integer size) {
		List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
        	res.add(i);
        }
        return res;
    }
}
