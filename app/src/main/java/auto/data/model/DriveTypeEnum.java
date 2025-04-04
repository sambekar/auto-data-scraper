package auto.data.model;

import lombok.Data;

@Data
public enum DriveTypeEnum {
	FWD("Front Wheel Drive"),
    RWD("Rear Wheel Drive"),
    FBFD("4X4 Wheel Drive"),
    AWD("All Wheel Drive");
	private final String description;

    DriveTypeEnum(String desc) {
		this.description = desc;
	}

	
}
