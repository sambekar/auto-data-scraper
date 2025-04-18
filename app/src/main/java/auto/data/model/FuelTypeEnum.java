package auto.data.model;


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
