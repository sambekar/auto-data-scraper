package auto.data.model;


public enum FrontSuspensionTypeEnum {
	MacPhersonStrut("Common in front-wheel-drive cars, simple and compact."),
	DoubleWishbone("Provides better handling and stability, used in high-performance cars."),
	MultiLink("More complex, offers superior ride quality and handling."),
	TrailingArm("Simple design, used in older cars and some off-road vehicles."),
	TorsionBar("Uses a bar instead of a coil spring, seen in some trucks and SUVs."),
	SolidAxle("Used in heavy-duty vehicles and off-road applications.");
	private final String description;

    FrontSuspensionTypeEnum(String desc) {
		this.description = desc;
	}

	
}
