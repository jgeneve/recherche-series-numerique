package enums;

public enum FeaturesEnum {
	WIDTH("width"), 
	MIN("min"),
	MAX("max"),
	ONE("one");
	
	private String name;
	 
	FeaturesEnum(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
	
};