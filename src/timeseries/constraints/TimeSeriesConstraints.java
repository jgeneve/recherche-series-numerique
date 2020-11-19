package timeseries.constraints;

import static timeseries.enums.PatternsEnum.*;
import static timeseries.functions.Aggregator.*;
import static timeseries.functions.Feature.*;
import static timeseries.functions.Patterns.*;

import java.lang.Integer;
import java.util.List;
import results.objects.AggregatorResult;

public class TimeSeriesConstraints {
    public static Integer min_one_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_one_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_one_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer min_one_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer min_one_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_one_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_one_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_one_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_one_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer min_one_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_one_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer min_one_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer min_one_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_one_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(one(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer min_width_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_width_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(width(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_surf_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(surf(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_max_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_max_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_max_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer min_max_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer min_max_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_max_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_max_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_max_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_max_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer min_max_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_max_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer min_max_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer min_max_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_max_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(max(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer min_min_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_min_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer min_min_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer min_min_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer min_min_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_min_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_min_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer min_min_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer min_min_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer min_min_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer min_min_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer min_min_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer min_min_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_min_min_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(min(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer min_range_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer min_range_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = min(range(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_one_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_one_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_one_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer max_one_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer max_one_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_one_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_one_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_one_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_one_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer max_one_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_one_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer max_one_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer max_one_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_one_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(one(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer max_width_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_width_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(width(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_surf_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(surf(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_max_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_max_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_max_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer max_max_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer max_max_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_max_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_max_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_max_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_max_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer max_max_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_max_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer max_max_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer max_max_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_max_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(max(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer max_min_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_min_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(GORGE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING, serie)));
        return resultAggregator;
    }

    public static Integer max_min_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(INFLEXION, serie)));
        return resultAggregator;
    }

    public static Integer max_min_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PEAK, serie)));
        return resultAggregator;
    }

    public static Integer max_min_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_min_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_min_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator;
    }

    public static Integer max_min_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator;
    }

    public static Integer max_min_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STEADY, serie)));
        return resultAggregator;
    }

    public static Integer max_min_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator;
    }

    public static Integer max_min_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(SUMMIT, serie)));
        return resultAggregator;
    }

    public static Integer max_min_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(VALLEY, serie)));
        return resultAggregator;
    }

    public static Integer max_min_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }

    public static AggregatorResult pos_max_min_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(min(applyPattern(ZIGZAG, serie)));
        return resultAggregator;
    }

    public static Integer max_range_bump_on_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(BUMP_ON_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_decreasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(DECREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_decreasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(DECREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_dip_on_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(DIP_ON_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_gorge(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(GORGE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_increasing(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(INCREASING, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_increasing_terrace(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(INCREASING_TERRACE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_inflexion(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(INFLEXION, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_peak(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(PEAK, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_proper_plain(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(PROPER_PLAIN, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_proper_plateau(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(PROPER_PLATEAU, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_steady(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(STEADY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_steady_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(STEADY_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_strictly_decreasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(STRICTLY_DECREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_strictly_increasing_sequence(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(STRICTLY_INCREASING_SEQUENCE, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_summit(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(SUMMIT, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_valley(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(VALLEY, serie)));
        return resultAggregator.getValue();
    }

    public static Integer max_range_zigzag(List<Integer> serie) {
        AggregatorResult resultAggregator = max(range(applyPattern(ZIGZAG, serie)));
        return resultAggregator.getValue();
    }
}
