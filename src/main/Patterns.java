package main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import enums.PatternsEnum;

public class Patterns { 
	
	public static List<List<Integer>> applyPattern(PatternsEnum pattern, List<Integer> serie) {
		// On transforme la liste d'integer en signature
		String sig = getSignature(serie); 
		
		Pattern p = Pattern.compile(pattern.getRegex());
		Matcher matcher = p.matcher(sig);

		List<List<Integer>> results = new ArrayList<List<Integer>>();
		// Pour chaque pattern trouvé dans la série
		while(matcher.find()) {
			// On récupère la position du premier / dernier élément du pattern dans la série
			int start = matcher.start();
			int end = matcher.end();
			// On récupère l'offset de départ / fin correspondant à la définition du pattern
			int patternStartOffset = pattern.getStart();
			int patternEndOffset = pattern.getEnd();
			
			// On récupère la sous-série N trouvé par le regex en applicant les offsets
			List<Integer> sublist = serie.subList(start+patternStartOffset, end+1-patternEndOffset); // +1 car le paramètre de fin de sublist est EXCLUSIF
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
