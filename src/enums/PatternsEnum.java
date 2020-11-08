package enums;

public enum PatternsEnum {
	BUMP_ON_DECREASING_SEQUENCE("bump_on_decreasing_sequence", ">><>>",2,1),
	DECREASING("decreasing", ">",0,0),
	DECREASING_SEQUENCE("decreasing_sequence", ">(>|=)*>|>",0,0),
	DECREASING_TERRACE("decreasing_terrace", ">=+>",1,1),
	DIP_ON_INCREASING_SEQUENCE("dip_on_increasing_sequence", "<<><<",2,1),
	GORGE("gorge", "(>|>(=|>)^*>)(<|<(=|<)^*<)",1,1),
	INCREASING("increasing", "<",0,0),
	INCREASING_SEQUENCE("increasing_sequence", "<(<|=)*<|<",0,0),
	INCREASING_TERRACE("increasing_terrace", "<=+<", 1,1),
	INFLEXION("inflexion", "<(<|=)*>|>(>|=)*<",1,1),
	PEAK("peak", "<(=|<)*(>|=)*>",1,1),
	PLAIN("plain", ">=*<",1,1),
	PLATEAU("plateau", "<=*>",1,1),
	PROPER_PLAIN("proper_plain", ">=+<",1,1),
	PROPER_PLATEAU("proper_plateau", "<=+>",1,1),
	STEADY("steady", "=",0,0),
	STEADY_SEQUENCE("steady_sequence", "=+",0,0),
	STRICTLY_DECREASING_SEQUENCE("strictly_decreasing_sequence", ">+",0,0),
	STRICTLY_INCREASING_SEQUENCE("strictly_increasing_sequence", "<+",0,0),
	SUMMIT("summit", "(<|(<(=|<)*<))(>|(>(=|>)*>))",1,1),
	VALLEY("valley", ">(=|>)*(<|=)*<",1,1),
	ZIGZAG("zigzag", "(<>)+(<|<>)|(><)+(>|><)",1,1);
//	ZIGZAG2("zigzag2", "(<>|<<>|<>>|<<>>)+(<|<<|<>|<<>|<>>|<<>>)|(><|>><|><<|>><<)+(>|>>|><|>><|><<|>><<)",1,1);
	
	private final String name;
    private final String regex;
    private final int start;
    private final int end;

    PatternsEnum(String name, String regex, int start,int end) {
        this.name = name;
        this.regex = regex;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }
    public String getRegex() {
        return regex;
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
}