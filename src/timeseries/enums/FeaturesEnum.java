package timeseries.enums;

public enum FeaturesEnum {
	ONE("one"),
	WIDTH("width"),
	SURF("surf"),
	MAX("max"),
	MIN("min"),
	RANGE("range");
	
	private String name;
	 
	FeaturesEnum(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
	
};