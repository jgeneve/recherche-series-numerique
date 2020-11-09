package com.imt.seriesNumerique;

import enums.PatternsEnum;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class SeriesNumerique {
    public static List<List<Integer>> applyPattern(PatternsEnum pattern, List<Integer> serie) {
        String sig = getSignature(serie);
        Pattern p = Pattern.compile(pattern.getRegex());
        Matcher matcher = p.matcher(sig);
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        while(matcher.find()) {
            Integer start = matcher.start();
            Integer end = matcher.end();
            Integer patternStartOffset = pattern.getStart();
            Integer patternEndOffset = pattern.getEnd();
            List<Integer> sublist = serie.subList(start+patternStartOffset, end-patternEndOffset+1);
            results.add(sublist);
        }
        return results;
    }

    public static String getSignature(List<Integer> serie) {
        String result = "";
        for (int i = 1; i < serie.size(); i++) {
            if (serie.get(i - 1) > serie.get(i)) {
                result += ">";
            }
            else if (serie.get(i - 1) < serie.get(i)) {
                result += "<";
            }
            else {
                result += "=";
            }
        }
        return result;
    }

    public static List<Integer> width(List<List<Integer>> resultsPattern) {
        List<Integer> results = new ArrayList<>();
        Integer listSize;
        for (List<Integer> resultPattern : resultsPattern) {
            listSize = resultPattern.size();
            results.add(listSize);
        }
        return results;
    }

    public static Integer min(List<Integer> resultsFeature) {
        Integer min = Integer.MAX_VALUE;
        for (Integer resultFeature : resultsFeature) {
            if (resultFeature < min) {
                min = resultFeature;
            }
        }
        return min;
    }

    Integer min_width_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = width(resultsPattern);
        Integer resultAggregator = min(resultsFeature);
        return resultAggregator;
    }
}
