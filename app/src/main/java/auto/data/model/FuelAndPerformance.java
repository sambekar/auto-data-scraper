package auto.data.model;

import lombok.Data;

@Data
public class FuelAndPerformance {
	private FuelTypeEnum fuelType;
	private double petrolMileageArai;
	private int petrolFuelTankCapacity;
	private EmissionNormEnum emissionNormCompliance;

}
