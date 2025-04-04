package auto.data.model;

import lombok.Data;

@Data
public enum RearSuspensionTypeEnum {
	TwistBeam("Common in budget hatchbacks, lightweight and cost-effective."),
	MultiLinkRear("Found in premium sedans and SUVs for improved handling and comfort."),
	DoubleWishboneRear("Used in high-performance and sports cars."),
	TrailingArm("Older design, still used in some off-road vehicles."),
	SemiTrailingArm("A compromise between trailing arm and multi-link, used in some cars."),
	RigidAxle("Common in trucks, SUVs, and off-road vehicles for durability."),
	Air("Uses air springs instead of coil or leaf springs, found in luxury and high-end SUVs."),
	Hydropneumatic("A specialized system used in Citroën and other high-end vehicles for a smooth ride.");
	private final String description;

	RearSuspensionTypeEnum(String desc) {
		this.description = desc;
	}
}
