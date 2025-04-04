package auto.data.model;

import lombok.Data;

@Data
public enum FuelTypeEnum {
	DEISEL("DEISEL"),
    PETROL("PETROL"),
    CNG("CNG"),
    EV("Electric Vehicle");
	private final String description;

    FuelTypeEnum(String desc) {
		this.description = desc;
	}

	
}
