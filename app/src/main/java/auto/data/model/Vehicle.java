package auto.data.model;

import lombok.Data;

@Data
public class Vehicle {
	private String make;
	private String model;
	private String modelIdentifier;
	private Price price;
	private EngineAndTransmission engineAndTransmission;
	private FuelAndPerformance fuelAndPerformance;
	private SuspensionSteeringBrakes suspensionSteeringBrakes;
	private DimensionAndCapacity dimensionAndCapacity;
	private ComfortAndConvenience ComfortAndConvenience;
	private Interior interior;
	private Exterior exterior;
	private Safety safety;
	private EntertainmentAndCommunication entertainmentAndCommunication;
	private AdasFeature adasFeature;
	private AdvanceInternetFeature advanceInternetFeature;

}
