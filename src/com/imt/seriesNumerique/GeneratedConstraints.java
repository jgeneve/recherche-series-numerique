package com.imt.seriesNumerique;

import java.lang.Integer;
import java.util.List;

import enums.PatternsEnum;
import main.Aggregator;
import main.Feature;
import main.Patterns;

public class GeneratedConstraints {
    public static Integer min_one_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_one_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_width_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_surf_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_max_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_min_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer min_range_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.min(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_one_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.one(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_width_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.width(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_surf_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.surf(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_max_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.max(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_min_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.min(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_peak(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_bump_on_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.BUMP_ON_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_decreasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_decreasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DECREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_dip_on_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.DIP_ON_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_gorge(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.GORGE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_increasing(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_increasing_terrace(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INCREASING_TERRACE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_inflexion(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.INFLEXION, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLAIN, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PLATEAU, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_proper_plain(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLAIN, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_proper_plateau(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PROPER_PLATEAU, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_steady(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_steady_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STEADY_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_strictly_decreasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_DECREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_strictly_increasing_sequence(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.STRICTLY_INCREASING_SEQUENCE, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_summit(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.SUMMIT, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_valley(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.VALLEY, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }

    public static Integer max_range_zigzag(List<Integer> serie) {
        List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.ZIGZAG, serie);
        List<Integer> resultsFeature = Feature.range(resultsPattern);
        Integer resultAggregator = Aggregator.max(resultsFeature);
        return resultAggregator;
    }
}
