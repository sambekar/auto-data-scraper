package auto.data.model;


public enum BrakeTypeEnum {
	DISC("DISC"),
    DRUM("DRUM");
	private final String description;

    BrakeTypeEnum(String desc) {
		this.description = desc;
	}

	
}
