package auto.data.model;

import lombok.Data;

@Data
public class SuspensionSteeringBrakes {
	private FrontSuspensionTypeEnum frontSuspension;
	private RearSuspensionTypeEnum rearSuspension;
	private String steeringType;
	private String steeringColumn;
	private double turningRadius;
	private BrakeTypeEnum frontBrakeType;
	private BrakeTypeEnum rearBrakeType;
}
