package enums;

public enum FeaturesEnum {
	ONE("one"),
	WIDTH("width"),
	SURFACE("surface"),
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