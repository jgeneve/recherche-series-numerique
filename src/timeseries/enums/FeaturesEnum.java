package timeseries.enums;

public enum FeaturesEnum {
	ONE("one", false),
	WIDTH("width", true),
	SURF("surf", true),
	MAX("max", false),
	MIN("min", false),
	RANGE("range", true);

	private String name;
	private boolean constantFeature;
	 
	FeaturesEnum(String name, boolean constantFeature) {
        this.name = name;
        this.constantFeature = constantFeature;
    }

    public String getName() {
        return name;
    }
    
    public boolean isConstantFeature() {
        return constantFeature;
    }
	
};