package results.objects;

import java.util.List;

public class AggregatorResult {
	
	
	private Integer value;
	private List<Integer> positions;
	
	public AggregatorResult(Integer value, List<Integer> positions) {
		super();
		this.value = value;
		this.positions = positions;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public List<Integer> getPositions() {
		return positions;
	}

	public void setPosition(List<Integer> positions) {
		this.positions = positions;
	}

	@Override
	public String toString() {
		return "AggregatorResult [value=" + value + ", position=" + positions + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AggregatorResult other = (AggregatorResult) obj;
		if (positions == null) {
			if (other.positions != null)
				return false;
		} else if (!positions.equals(other.positions))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
	
	
	
}
