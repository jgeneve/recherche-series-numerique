package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSignature(new ArrayList<>(
	            Arrays.asList(4, 4, 2, 2, 3, 5, 5, 6, 3, 1, 1, 2, 2, 2, 2, 2, 2, 1))));
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
