package auto.data.model;

import lombok.Data;

@Data
public class DimensionAndCapacity {
	private int length;
	private int width;
	private int height;
	private int seatingCapacity;
	private int groundClearanceUnladen;
	private int wheelBase;
	private int frontTread;
	private int noOfDoors;
	private int reportedBootSpace;
}
