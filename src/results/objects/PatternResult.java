package results.objects;

import java.util.List;

public class PatternResult {

	private List<List<Integer>> seriesInPattern;
	private List<List<Integer>> posSeriesInPattern;
	
	public PatternResult(List<List<Integer>> seriesInPattern, List<List<Integer>> posSeriesInPattern) {
		super();
		this.seriesInPattern = seriesInPattern;
		this.posSeriesInPattern = posSeriesInPattern;
	}

	public List<List<Integer>> getSeriesInPattern() {
		return seriesInPattern;
	}

	public void setSeriesInPattern(List<List<Integer>> seriesInPattern) {
		this.seriesInPattern = seriesInPattern;
	}

	public List<List<Integer>> getPosSeriesInPattern() {
		return posSeriesInPattern;
	}

	public void setPosSeriesInPattern(List<List<Integer>> posSeriesInPattern) {
		this.posSeriesInPattern = posSeriesInPattern;
	}

	@Override
	public String toString() {
		return "PatternResult [seriesInPattern=" + seriesInPattern + ", posSeriesInPattern=" + posSeriesInPattern + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatternResult other = (PatternResult) obj;
		if (posSeriesInPattern == null) {
			if (other.posSeriesInPattern != null)
				return false;
		} else if (!posSeriesInPattern.equals(other.posSeriesInPattern))
			return false;
		if (seriesInPattern == null) {
			if (other.seriesInPattern != null)
				return false;
		} else if (!seriesInPattern.equals(other.seriesInPattern))
			return false;
		return true;
	}
	
	
}
