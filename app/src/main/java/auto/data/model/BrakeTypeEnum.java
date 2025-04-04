package auto.data.model;

import lombok.Data;

@Data
public enum BrakeTypeEnum {
	DISC("DISC"),
    DRUM("DRUM");
	private final String description;

    BrakeTypeEnum(String desc) {
		this.description = desc;
	}

	
}
