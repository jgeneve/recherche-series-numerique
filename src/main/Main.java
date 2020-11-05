package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	private static Pattern pattern;
	private static Matcher matcher;
	

	public static void main(String[] args) {

//		System.out.println(getSignature(new ArrayList<>(
//	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))));
		
		
		// TEST PEAK REGEX
		ArrayList<Integer> serie = new ArrayList<>(Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1));
		String sig = getSignature(serie);
		
		pattern = Pattern.compile("<(=|<)*(>|=)*>");
		matcher = pattern.matcher(sig);

		while(matcher.find()) {
        System.out.print("Start index: " + (matcher.start()));
        System.out.print(" End index: " + (matcher.end()));
        System.out.println(" Found: " + matcher.group());
  
        System.out.println(serie.subList(matcher.start(), matcher.end()+1)); // +1 because sublist end is exclusif
		}
		
		
//		pattern = Pattern.compile("<(=|<)*(>|=)*>");
//		ArrayList<Integer> serie = new ArrayList<>(Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1));
//		String sig = getSignature(serie);
//		matcher = pattern.matcher(sig);
//		while(matcher.find()) {
//        System.out.print("Start index: " + (matcher.start()));
//        System.out.print(" End index: " + (matcher.end()));
//        System.out.println(" Found: " + matcher.group());
//  
//        System.out.println(serie.subList(matcher.start(), matcher.end()+1)); // +1 because sublist end is exclusif
//		}
		

//		pattern = Pattern.compile("=+");
//		ArrayList<Integer> serie = new ArrayList<>(Arrays.asList(3,1,1,4,5,5,5,6,2,2,4,4,3,2,1,1));
//		String sig = getSignature(serie);
//		System.out.println(sig);
//		matcher = pattern.matcher(sig);
//		
//		ArrayList<Integer> res;
//		while(matcher.find()) {
//	        System.out.print("Start index: " + (matcher.start()));
//	        System.out.print(" End index: " + (matcher.end()));
//	        System.out.println(" Found: " + matcher.group());
//	  
//	        System.out.println(serie.subList(matcher.start(), matcher.end()+1)); // +1 because sublist end is exclusif
//		}
		
	}

    public static String getSignature(ArrayList<Integer> serie) {
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
