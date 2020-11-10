package timeseries.enums;

public enum AggregatorsEnum {
	MIN("min"), 
	MAX("max");
	
	private String name;
	 
	AggregatorsEnum(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
	
};
