package results.objects;

import java.util.List;

public class FeatureResult {

	private List<Integer> seriesInFeature;
	private List<Integer> posSeriesInFeature;
	
	public FeatureResult(List<Integer> seriesInFeature, List<Integer> posSeriesInFeature) {
		super();
		this.seriesInFeature = seriesInFeature;
		this.posSeriesInFeature = posSeriesInFeature;
	}
	public List<Integer> getSeriesInFeature() {
		return seriesInFeature;
	}
	public void setSeriesInFeature(List<Integer> seriesInFeature) {
		this.seriesInFeature = seriesInFeature;
	}
	public List<Integer> getPosSeriesInFeature() {
		return posSeriesInFeature;
	}
	public void setPosSeriesInFeature(List<Integer> posSeriesInFeature) {
		this.posSeriesInFeature = posSeriesInFeature;
	}
	
	@Override
	public String toString() {
		return "FeatureResult [seriesInFeature=" + seriesInFeature + ", posSeriesInFeature=" + posSeriesInFeature + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeatureResult other = (FeatureResult) obj;
		if (posSeriesInFeature == null) {
			if (other.posSeriesInFeature != null)
				return false;
		} else if (!posSeriesInFeature.equals(other.posSeriesInFeature))
			return false;
		if (seriesInFeature == null) {
			if (other.seriesInFeature != null)
				return false;
		} else if (!seriesInFeature.equals(other.seriesInFeature))
			return false;
		return true;
	}
	
}
