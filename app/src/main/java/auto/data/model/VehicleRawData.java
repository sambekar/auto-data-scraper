package auto.data.model;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import auto.data.util.UtilTransformers;
import lombok.Data;

@Data
public class VehicleRawData {
	private String variantName;
	private BigDecimal priceExShowroomPrice;
	private BigDecimal priceRTO;
	private BigDecimal priceInsurance;
	private BigDecimal priceOthers;
	private BigDecimal priceOptional;
	private BigDecimal priceOnRoadPriceinNewDelhi;
	private BigDecimal priceOnRoadPriceinMumbai;

	private String engineTransmissionEngineType;
	private int engineTransmissionDisplacement;
	private Power engineTransmissionMaxPower;
	private Torque engineTransmissionMaxTorque;
	private int engineTransmissionNoofCylinders;
	private int engineTransmissionValvesPerCylinder;
	private String engineTransmissionValveConfiguration;
	private String engineTransmissionFuelSupplySystem;
	private Boolean engineTransmissionTurboCharger;
	private String engineTransmissionTransmissionType;
	private String engineTransmissionGearbox;
	private String engineTransmissionDriveType;

	private String fuelPerformanceFuelType;
	private String fuelPerformancePetrolMileageARAI;
	private String fuelPerformanceDieselMileageARAI;
	private String fuelPerformancePetrolFuelTankCapacity;
	private String fuelPerformanceDieselFuelTankCapacity;
	private String fuelPerformanceEmissionNormCompliance;
	private String fuelPerformanceSecondaryFuelType;
	private String fuelPerformanceTopSpeed;

	private String suspensionSteeringBrakesFrontSuspension;
	private String suspensionSteeringBrakesRearSuspension;
	private String suspensionSteeringBrakesSteeringType;
	private String suspensionSteeringBrakesSteeringColumn;
	private String suspensionSteeringBrakesTurningRadius;
	private String suspensionSteeringBrakesFrontBrakeType;
	private String suspensionSteeringBrakesRearBrakeType;
	private String suspensionSteeringBrakesAlloyWheelSizeFront;
	private String suspensionSteeringBrakesAlloyWheelSizeRear;
	private String suspensionSteeringBrakesSteeringGearType;


	private int dimensionsCapacityLength;
	private int dimensionsCapacityWidth;
	private int dimensionsCapacityHeight;
	private int dimensionsCapacitySeatingCapacity;
	private int dimensionsCapacityGroundClearanceUnladen;
	private int dimensionsCapacityWheelBase;
	private int dimensionsCapacityFrontTread;
	private int dimensionsCapacityNoofDoors;
	private int dimensionsCapacityReportedBootSpace;
	private int dimensionsCapacityBootSpace;
	private int dimensionsCapacityKerbWeight;
	private int dimensionsCapacityGrossWeight;

	private Boolean comfortConveniencePowerSteering;
	private Boolean comfortConvenienceAirConditioner;
	private Boolean comfortConvenienceHeater;
	private Boolean comfortConvenienceAdjustableSteering;
	private Boolean comfortConvenienceHeightAdjustableDriverSeat;
	private Boolean comfortConvenienceVentilatedSeats;
	private Boolean comfortConvenienceElectricAdjustableSeats;
	private Boolean comfortConvenienceAutomaticClimateControl;
	private Boolean comfortConvenienceAccessoryPowerOutlet;
	private Boolean comfortConvenienceTrunkLight;
	private Boolean comfortConvenienceVanityMirror;
	private Boolean comfortConvenienceRearReadingLamp;
	private Boolean comfortConvenienceAdjustableHeadrest;
	private Boolean comfortConvenienceRearSeatCentreArmRest;
	private Boolean comfortConvenienceHeightAdjustableFrontSeatBelts;
	private Boolean comfortConvenienceRearACVents;
	private Boolean comfortConvenienceCruiseControl;
	private String comfortConvenienceParkingSensors;
	private String comfortConvenienceFoldableRearSeat;
	private Boolean comfortConvenienceKeyLessEntry;
	private Boolean comfortConvenienceEngineStartStopButton;
	private Boolean comfortConvenienceCooledGlovebox;
	private Boolean comfortConvenienceVoiceCommands;
	private Boolean comfortConveniencePaddleShifters;
	private String comfortConvenienceUSBCharger;
	private String comfortConvenienceCentralConsoleArmrest;
	private Boolean comfortConvenienceHandsFreeTailgate;
	private Boolean comfortConvenienceIdleStartStopSystem;
	private Boolean comfortConvenienceRearWindowSunblind;
	private Boolean comfortConvenienceAutomaticHeadlamps;
	private Boolean comfortConvenienceFollowMeHomeHeadlamps;
	private Boolean comfortConvenienceAdditionalFeatures;
	private Boolean comfortConvenienceVoiceassistedsunroof;
	private String comfortConvenienceDriveModeTypes;
	private String comfortConveniencePowerWindows;
	private String comfortConvenienceRearSeatHeadrest;
	private String comfortConvenienceLumbarSupport;
	private String comfortConvenienceCupHolders;
	private String comfortConvenienceDriveModes;
	private String comfortConvenienceGearShiftIndicator;
	private String comfortConvenienceLuggageHookNet;
	private String comfortConvenienceRearCurtain;
	private Boolean comfortConvenienceRealTimeVehicleTracking;
	private Boolean comfortConvenienceGloveBoxlight;

	private Boolean interiorTachometer;
	private Boolean interiorGloveBox;
	private Boolean interiorDigitalOdometer;
	private Boolean interiorDualToneDashboard;
	private String interiorAdditionalFeatures;
	private String interiorDigitalCluster;
	private String interiorUpholstery;
	private String interiorDigitalClusterSize;

	private Boolean exteriorRearWindowWiper;
	private Boolean exteriorRearWindowWasher;
	private Boolean exteriorRearWindowDefogger;
	private Boolean exteriorWheelCovers;
	private Boolean exteriorAlloyWheels;
	private Boolean exteriorRearSpoiler;
	private Boolean exteriorOutsideRearViewMirrorTurnIndicators;
	private Boolean exteriorIntegratedAntenna;
	private Boolean exteriorProjectorHeadlamps;
	private Boolean exteriorRoofRails;
	private String exteriorAntenna;
	private Boolean exteriorSunroof;
	private String exteriorBootOpening;
	private Boolean exteriorPuddleLamps;
	private Tyre exteriorTyreSize;
	private String exteriorTyreType;
	private String exteriorWheelSize;
	private Boolean exteriorLEDDRLs;
	private Boolean exteriorLEDHeadlamps;
	private Boolean exteriorLEDTaillights;
	private String exteriorAdditionalFeatures;
	private String exteriorFogLightsFront;
	private String exteriorFogLightsRear;
	private String exteriorOutsideRearViewMirrorORVM;
	private String exteriorPowerAntenna;
	private Boolean exteriorAdjustableHeadlamps;
	private Boolean exteriorHalogenHeadlamps;

	private Boolean safetyAntilockBrakingSystemABS;
	private Boolean safetyCentralLocking;
	private Boolean safetyChildSafetyLocks;
	private Boolean safetyAntiTheftAlarm;
	private String safetyNoofAirbags;
	private Boolean safetyDriverAirbag;
	private Boolean safetyPassengerAirbag;
	private Boolean safetySideAirbag;
	private Boolean safetySideAirbagRear;
	private Boolean safetyDayNightRearViewMirror;
	private Boolean safetyCurtainAirbag;
	private Boolean safetyElectronicBrakeforceDistributionEBD;
	private Boolean safetySeatBeltWarning;
	private Boolean safetyDoorAjarWarning;
	private Boolean safetyTractionControl;
	private Boolean safetyTyrePressureMonitoringSystemTPMS;
	private Boolean safetyEngineImmobilizer;
	private Boolean safetyElectronicStabilityControlESC;
	private Boolean safetyRearCamera;
	private Boolean safetyAntiTheftDevice;
	private Boolean safetySpeedAlert;
	private Boolean safetySpeedSensingAutoDoorLock;
	private Boolean safetyKneeAirbags;
	private Boolean safetyISOFIXChildSeatMounts;
	private String safetyPretensionersForceLimiterSeatbelts;
	private Boolean safetyHillAssist;
	private Boolean safetyImpactSensingAutoDoorUnlock;
	private Boolean safety360ViewCamera;
	private String safetyGlobalNCAPSafetyRating;
	private String safetyGlobalNCAPChildSafetyRating;
	private String safetyAntiPinchPowerWindows;
	private Boolean safetyBrakeAssist;
	private Boolean safetyHeadsUpDisplayHUD;
	private Boolean safetyHillDescentControl;

	private Boolean entertainmentCommunicationRadio;
	private Boolean entertainmentCommunicationIntegrated2DINAudio;
	private Boolean entertainmentCommunicationWirelessPhoneCharging;
	private Boolean entertainmentCommunicationBluetoothConnectivity;
	private Boolean entertainmentCommunicationTouchscreen;
	private Boolean entertainmentCommunicationAndroidAuto;
	private Boolean entertainmentCommunicationAppleCarPlay;
	private Boolean entertainmentCommunicationUsbPorts;
	private Boolean entertainmentCommunicationInbuiltApps;
	private Boolean entertainmentCommunicationAdditionalFeatures;
	private Boolean entertainmentCommunicationSpeakers;
	private String entertainmentCommunicationNoofSpeakers;
	private String entertainmentCommunicationTouchscreenSize;
	private String entertainmentCommunicationConnectivity;
	private String entertainmentCommunicationTweeters;
	private String entertainmentCommunicationSubwoofer;

	private Boolean aDASFeatureForwardCollisionWarning;
	private Boolean aDASFeatureBlindSpotCollisionAvoidanceAssist;
	private Boolean aDASFeatureLaneDepartureWarning;
	private Boolean aDASFeatureLaneKeepAssist;
	private Boolean aDASFeatureDriverAttentionWarning;
	private Boolean aDASFeatureAdaptiveCruiseControl;
	private Boolean aDASFeatureLeadingVehicleDepartureAlert;
	private Boolean aDASFeatureAdaptiveHighBeamAssist;
	private Boolean aDASFeatureRearCrossTrafficAlert;
	private Boolean aDASFeatureRearCrossTrafficCollisionAvoidanceAssist;
	private Boolean aDASFeatureBlindSpotMonitor;

	private Boolean advanceInternetFeatureLiveLocation;
	private Boolean advanceInternetFeatureECallICall;
	private Boolean advanceInternetFeatureOvertheAirOTAUpdates;
	private Boolean advanceInternetFeatureGoogleAlexaConnectivity;
	private Boolean advanceInternetFeatureSOSButton;
	private Boolean advanceInternetFeatureRSA;
	private String advanceInternetFeatureInbuiltAPPs;
	private Boolean advanceInternetFeatureRemoteImmobiliser;
	private Boolean advanceInternetFeatureSendPOItoVehicleFromApp;
	private Boolean advanceInternetFeatureOverSpeedingAlert;
	private Boolean advanceInternetFeatureTowAwayAlert;
	private Boolean advanceInternetFeatureSmartwatchApp;
	private Boolean advanceInternetFeatureValetMode;
	private Boolean advanceInternetFeatureRemoteACOnOff;
	private Boolean advanceInternetFeatureRemoteDoorLockUnlock;
	private Boolean advanceInternetFeatureSOSEmergencyAssistance;
	private Boolean advanceInternetFeatureGeofenceAlert;

	public void transformpriceExShowroomPrice(String priceExShowroomPrice) {
		this.priceExShowroomPrice = UtilTransformers.convertToBigDecimal(priceExShowroomPrice);
	}

	public void transformpriceRTO(String priceRTO) {
		this.priceRTO = UtilTransformers.convertToBigDecimal(priceRTO);
	}

	public void transformpriceInsurance(String priceInsurance) {
		this.priceInsurance = UtilTransformers.convertToBigDecimal(priceInsurance);
	}

	public void transformpriceOthers(String priceOthers) {
		this.priceOthers = UtilTransformers.convertToBigDecimal(priceOthers);
	}

	public void transformpriceOptional(String priceOptional) {
		this.priceOptional = UtilTransformers.convertToBigDecimal(priceOptional);
	}

	public void transformpriceOnRoadPriceinNewDelhi(String priceOnRoadPriceinNewDelhi) {
		this.priceOnRoadPriceinNewDelhi = UtilTransformers.convertToBigDecimal(priceOnRoadPriceinNewDelhi);
	}

	public void transformpriceOnRoadPriceinMumbai(String priceOnRoadPriceinMumbai) {
		this.priceOnRoadPriceinMumbai = UtilTransformers.convertToBigDecimal(priceOnRoadPriceinMumbai);
	}

	public void transformengineTransmissionMaxPower(String engineTransmissionMaxPower) {
		Pattern pattern = Pattern.compile("([0-9]+\\.?[0-9]*)bhp@([0-9]+)rpm");
		Matcher matcher = pattern.matcher(engineTransmissionMaxPower);

		if (matcher.matches()) {
			this.engineTransmissionMaxPower = new Power(Double.parseDouble(matcher.group(1)),
					Integer.parseInt(matcher.group(2)), StringUtils.EMPTY);
		} else {
			this.engineTransmissionMaxPower = new Power(0, 0, engineTransmissionMaxPower);
		}
	}

	public void transformengineTransmissionMaxTorque(String engineTransmissionMaxTorque) {
		Pattern pattern = Pattern.compile("([0-9]+\\.?[0-9]*)Nm@([0-9]+)rpm");
		Matcher matcher = pattern.matcher(engineTransmissionMaxTorque);

		if (matcher.matches()) {
			this.engineTransmissionMaxTorque = new Torque(Double.parseDouble(matcher.group(1)),
					Integer.parseInt(matcher.group(2)), StringUtils.EMPTY);
		} else {
			this.engineTransmissionMaxTorque = new Torque(0, 0, engineTransmissionMaxTorque);
		}
	}

	public void transformengineTransmissionDisplacement(String engineTransmissionDisplacement) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*cc");
		Matcher matcher = pattern.matcher(engineTransmissionDisplacement);

		if (matcher.matches()) {
			this.engineTransmissionDisplacement = Integer.parseInt(matcher.group(1));
		} else {
			this.engineTransmissionDisplacement = 0;
		}
	}

	public void transformdimensionsCapacityLength(String dimensionsCapacityLength) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityLength);

		if (matcher.matches()) {
			this.dimensionsCapacityLength = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityLength = 0;
		}
	}

	public void transformdimensionsCapacityWidth(String dimensionsCapacityWidth) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityWidth);

		if (matcher.matches()) {
			this.dimensionsCapacityWidth = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityWidth = 0;
		}
	}

	public void transformdimensionsCapacityHeight(String dimensionsCapacityHeight) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityHeight);

		if (matcher.matches()) {
			this.dimensionsCapacityHeight = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityHeight = 0;
		}
	}

	public void transformdimensionsCapacitySeatingCapacity(String dimensionsCapacitySeatingCapacity) {
		this.dimensionsCapacitySeatingCapacity = Integer.parseInt(dimensionsCapacitySeatingCapacity);
	}

	public void transformdimensionsCapacityGroundClearanceUnladen(String dimensionsCapacityGroundClearanceUnladen) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityGroundClearanceUnladen);

		if (matcher.matches()) {
			this.dimensionsCapacityGroundClearanceUnladen = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityGroundClearanceUnladen = 0;
		}
	}

	public void transformdimensionsCapacityWheelBase(String dimensionsCapacityWheelBase) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityWheelBase);

		if (matcher.matches()) {
			this.dimensionsCapacityWheelBase = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityWheelBase = 0;
		}
	}

	public void transformdimensionsCapacityFrontTread(String dimensionsCapacityFrontTread) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*mm");
		Matcher matcher = pattern.matcher(dimensionsCapacityFrontTread);

		if (matcher.matches()) {
			this.dimensionsCapacityFrontTread = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityFrontTread = 0;
		}
	}

	public void transformdimensionsCapacityNoofDoors(String dimensionsCapacityNoofDoors) {
		this.dimensionsCapacityNoofDoors = Integer.parseInt(dimensionsCapacityNoofDoors);
	}

	public void transformdimensionsCapacityReportedBootSpace(String dimensionsCapacityReportedBootSpace) {
		Pattern pattern = Pattern.compile("(\\d+)\\s*Litres");
		Matcher matcher = pattern.matcher(dimensionsCapacityReportedBootSpace);

		if (matcher.matches()) {
			this.dimensionsCapacityReportedBootSpace = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityReportedBootSpace = 0;
		}
	}
	
	public void transformdimensionsCapacityBootSpace(String dimensionsCapacityBootSpace) {
		Pattern pattern = Pattern.compile("(\\d+)");
		Matcher matcher = pattern.matcher(dimensionsCapacityBootSpace);

		if (matcher.matches()) {
			this.dimensionsCapacityBootSpace = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityBootSpace = 0;
		}
	}
	
	public void transformdimensionsCapacityKerbWeight(String dimensionsCapacityKerbWeight) {
		Pattern pattern = Pattern.compile("\\d+-(\\d+)");
		Matcher matcher = pattern.matcher(dimensionsCapacityKerbWeight);

		if (matcher.matches()) {
			this.dimensionsCapacityKerbWeight = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityKerbWeight = 0;
		}
	}
	
	public void transformdimensionsCapacityGrossWeight(String dimensionsCapacityGrossWeight) {
		Pattern pattern = Pattern.compile("^(\\d+)");
		Matcher matcher = pattern.matcher(dimensionsCapacityGrossWeight);

		if (matcher.matches()) {
			this.dimensionsCapacityGrossWeight = Integer.parseInt(matcher.group(1));
		} else {
			this.dimensionsCapacityGrossWeight = 0;
		}
	}
	
	public void transformexteriorTyreSize(String exteriorTyreSize) {
		 Pattern pattern = Pattern.compile("(\\d+)/(\\d+)\\s*R(\\d+)");
	        Matcher matcher = pattern.matcher(exteriorTyreSize);
	        Tyre tyre;
	        if (matcher.matches()) {
	        	tyre = new Tyre(Integer.parseInt(matcher.group(1)),Integer.parseInt(matcher.group(2)),Integer.parseInt(matcher.group(3)),StringUtils.EMPTY);	            
	        }else {
	        	tyre = new Tyre(0,0,0,exteriorTyreSize);
	        }
	        this.exteriorTyreSize = tyre;
		
	}
	public void transformengineTransmissionNoofCylinders(String engineTransmissionNoofCylinders) {
		this.engineTransmissionNoofCylinders = Integer.parseInt(engineTransmissionNoofCylinders);
	}

	public void transformengineTransmissionValvesPerCylinder(String engineTransmissionValvesPerCylinder) {
		this.engineTransmissionValvesPerCylinder = Integer.parseInt(engineTransmissionValvesPerCylinder);
	}

	public void transformengineTransmissionTurboCharger(String engineTransmissionTurboCharger) {
		this.engineTransmissionTurboCharger = BooleanUtils.toBooleanObject(engineTransmissionTurboCharger);
	}

	public void transformcomfortConveniencePowerSteering(String comfortConveniencePowerSteering) {
		this.comfortConveniencePowerSteering = BooleanUtils.toBooleanObject(comfortConveniencePowerSteering);
	}

	public void transformcomfortConvenienceAirConditioner(String comfortConvenienceAirConditioner) {
		this.comfortConvenienceAirConditioner = BooleanUtils.toBooleanObject(comfortConvenienceAirConditioner);
	}

	public void transformcomfortConvenienceHeater(String comfortConvenienceHeater) {
		this.comfortConvenienceHeater = BooleanUtils.toBooleanObject(comfortConvenienceHeater);
	}

	public void transformcomfortConvenienceAdjustableSteering(String comfortConvenienceAdjustableSteering) {
		this.comfortConvenienceAdjustableSteering = BooleanUtils.toBooleanObject(comfortConvenienceAdjustableSteering);
	}

	public void transformcomfortConvenienceHeightAdjustableDriverSeat(
			String comfortConvenienceHeightAdjustableDriverSeat) {
		this.comfortConvenienceHeightAdjustableDriverSeat = BooleanUtils
				.toBooleanObject(comfortConvenienceHeightAdjustableDriverSeat);
	}

	public void transformcomfortConvenienceVentilatedSeats(String comfortConvenienceVentilatedSeats) {
		this.comfortConvenienceVentilatedSeats = BooleanUtils.toBooleanObject(comfortConvenienceVentilatedSeats);
	}

	public void transformcomfortConvenienceElectricAdjustableSeats(String comfortConvenienceElectricAdjustableSeats) {
		this.comfortConvenienceElectricAdjustableSeats = BooleanUtils
				.toBooleanObject(comfortConvenienceElectricAdjustableSeats);
	}

	public void transformcomfortConvenienceAutomaticClimateControl(String comfortConvenienceAutomaticClimateControl) {
		this.comfortConvenienceAutomaticClimateControl = BooleanUtils
				.toBooleanObject(comfortConvenienceAutomaticClimateControl);
	}

	public void transformcomfortConvenienceAccessoryPowerOutlet(String comfortConvenienceAccessoryPowerOutlet) {
		this.comfortConvenienceAccessoryPowerOutlet = BooleanUtils
				.toBooleanObject(comfortConvenienceAccessoryPowerOutlet);
	}

	public void transformcomfortConvenienceTrunkLight(String comfortConvenienceTrunkLight) {
		this.comfortConvenienceTrunkLight = BooleanUtils.toBooleanObject(comfortConvenienceTrunkLight);
	}

	public void transformcomfortConvenienceVanityMirror(String comfortConvenienceVanityMirror) {
		this.comfortConvenienceVanityMirror = BooleanUtils.toBooleanObject(comfortConvenienceVanityMirror);
	}

	public void transformcomfortConvenienceRearReadingLamp(String comfortConvenienceRearReadingLamp) {
		this.comfortConvenienceRearReadingLamp = BooleanUtils.toBooleanObject(comfortConvenienceRearReadingLamp);
	}

	public void transformcomfortConvenienceAdjustableHeadrest(String comfortConvenienceAdjustableHeadrest) {
		this.comfortConvenienceAdjustableHeadrest = BooleanUtils.toBooleanObject(comfortConvenienceAdjustableHeadrest);
	}

	public void transformcomfortConvenienceRearSeatCentreArmRest(String comfortConvenienceRearSeatCentreArmRest) {
		this.comfortConvenienceRearSeatCentreArmRest = BooleanUtils
				.toBooleanObject(comfortConvenienceRearSeatCentreArmRest);
	}

	public void transformcomfortConvenienceHeightAdjustableFrontSeatBelts(
			String comfortConvenienceHeightAdjustableFrontSeatBelts) {
		this.comfortConvenienceHeightAdjustableFrontSeatBelts = BooleanUtils
				.toBooleanObject(comfortConvenienceHeightAdjustableFrontSeatBelts);
	}

	public void transformcomfortConvenienceRearACVents(String comfortConvenienceRearACVents) {
		this.comfortConvenienceRearACVents = BooleanUtils.toBooleanObject(comfortConvenienceRearACVents);
	}

	public void transformcomfortConvenienceCruiseControl(String comfortConvenienceCruiseControl) {
		this.comfortConvenienceCruiseControl = BooleanUtils.toBooleanObject(comfortConvenienceCruiseControl);
	}

	public void transformcomfortConvenienceKeyLessEntry(String comfortConvenienceKeyLessEntry) {
		this.comfortConvenienceKeyLessEntry = BooleanUtils.toBooleanObject(comfortConvenienceKeyLessEntry);
	}

	public void transformcomfortConvenienceEngineStartStopButton(String comfortConvenienceEngineStartStopButton) {
		this.comfortConvenienceEngineStartStopButton = BooleanUtils
				.toBooleanObject(comfortConvenienceEngineStartStopButton);
	}

	public void transformcomfortConvenienceCooledGlovebox(String comfortConvenienceCooledGlovebox) {
		this.comfortConvenienceCooledGlovebox = BooleanUtils.toBooleanObject(comfortConvenienceCooledGlovebox);
	}

	public void transformcomfortConvenienceVoiceCommands(String comfortConvenienceVoiceCommands) {
		this.comfortConvenienceVoiceCommands = BooleanUtils.toBooleanObject(comfortConvenienceVoiceCommands);
	}

	public void transformcomfortConveniencePaddleShifters(String comfortConveniencePaddleShifters) {
		this.comfortConveniencePaddleShifters = BooleanUtils.toBooleanObject(comfortConveniencePaddleShifters);
	}

	public void transformcomfortConvenienceHandsFreeTailgate(String comfortConvenienceHandsFreeTailgate) {
		this.comfortConvenienceHandsFreeTailgate = BooleanUtils.toBooleanObject(comfortConvenienceHandsFreeTailgate);
	}

	public void transformcomfortConvenienceIdleStartStopSystem(String comfortConvenienceIdleStartStopSystem) {
		this.comfortConvenienceIdleStartStopSystem = BooleanUtils
				.toBooleanObject(comfortConvenienceIdleStartStopSystem);
	}

	public void transformcomfortConvenienceRearWindowSunblind(String comfortConvenienceRearWindowSunblind) {
		this.comfortConvenienceRearWindowSunblind = BooleanUtils.toBooleanObject(comfortConvenienceRearWindowSunblind);
	}

	public void transformcomfortConvenienceAutomaticHeadlamps(String comfortConvenienceAutomaticHeadlamps) {
		this.comfortConvenienceAutomaticHeadlamps = BooleanUtils.toBooleanObject(comfortConvenienceAutomaticHeadlamps);
	}

	public void transformcomfortConvenienceFollowMeHomeHeadlamps(String comfortConvenienceFollowMeHomeHeadlamps) {
		this.comfortConvenienceFollowMeHomeHeadlamps = BooleanUtils
				.toBooleanObject(comfortConvenienceFollowMeHomeHeadlamps);
	}

	public void transformcomfortConvenienceAdditionalFeatures(String comfortConvenienceAdditionalFeatures) {
		this.comfortConvenienceAdditionalFeatures = BooleanUtils.toBooleanObject(comfortConvenienceAdditionalFeatures);
	}

	public void transformcomfortConvenienceVoiceassistedsunroof(String comfortConvenienceVoiceassistedsunroof) {
		this.comfortConvenienceVoiceassistedsunroof = BooleanUtils
				.toBooleanObject(comfortConvenienceVoiceassistedsunroof);
	}
	
	public void transformcomfortConvenienceRealTimeVehicleTracking(String comfortConvenienceRealTimeVehicleTracking) {
		this.comfortConvenienceRealTimeVehicleTracking = BooleanUtils
				.toBooleanObject(comfortConvenienceRealTimeVehicleTracking);
	}
	
	public void transformcomfortConvenienceGloveBoxlight(String comfortConvenienceGloveBoxlight) {
		this.comfortConvenienceGloveBoxlight = BooleanUtils
				.toBooleanObject(comfortConvenienceGloveBoxlight);
	}

	public void transforminteriorTachometer(String interiorTachometer) {
		this.interiorTachometer = BooleanUtils.toBooleanObject(interiorTachometer);
	}

	public void transforminteriorGloveBox(String interiorGloveBox) {
		this.interiorGloveBox = BooleanUtils.toBooleanObject(interiorGloveBox);
	}

	public void transforminteriorDigitalOdometer(String interiorDigitalOdometer) {
		this.interiorDigitalOdometer = BooleanUtils.toBooleanObject(interiorDigitalOdometer);
	}

	public void transforminteriorDualToneDashboard(String interiorDualToneDashboard) {
		this.interiorDualToneDashboard = BooleanUtils.toBooleanObject(interiorDualToneDashboard);
	}

	public void transformexteriorRearWindowWiper(String exteriorRearWindowWiper) {
		this.exteriorRearWindowWiper = BooleanUtils.toBooleanObject(exteriorRearWindowWiper);
	}

	public void transformexteriorRearWindowWasher(String exteriorRearWindowWasher) {
		this.exteriorRearWindowWasher = BooleanUtils.toBooleanObject(exteriorRearWindowWasher);
	}

	public void transformexteriorRearWindowDefogger(String exteriorRearWindowDefogger) {
		this.exteriorRearWindowDefogger = BooleanUtils.toBooleanObject(exteriorRearWindowDefogger);
	}

	public void transformexteriorWheelCovers(String exteriorWheelCovers) {
		this.exteriorWheelCovers = BooleanUtils.toBooleanObject(exteriorWheelCovers);
	}

	public void transformexteriorAlloyWheels(String exteriorAlloyWheels) {
		this.exteriorAlloyWheels = BooleanUtils.toBooleanObject(exteriorAlloyWheels);
	}

	public void transformexteriorRearSpoiler(String exteriorRearSpoiler) {
		this.exteriorRearSpoiler = BooleanUtils.toBooleanObject(exteriorRearSpoiler);
	}

	public void transformexteriorOutsideRearViewMirrorTurnIndicators(
			String exteriorOutsideRearViewMirrorTurnIndicators) {
		this.exteriorOutsideRearViewMirrorTurnIndicators = BooleanUtils
				.toBooleanObject(exteriorOutsideRearViewMirrorTurnIndicators);
	}

	public void transformexteriorIntegratedAntenna(String exteriorIntegratedAntenna) {
		this.exteriorIntegratedAntenna = BooleanUtils.toBooleanObject(exteriorIntegratedAntenna);
	}

	public void transformexteriorProjectorHeadlamps(String exteriorProjectorHeadlamps) {
		this.exteriorProjectorHeadlamps = BooleanUtils.toBooleanObject(exteriorProjectorHeadlamps);
	}

	public void transformexteriorRoofRails(String exteriorRoofRails) {
		this.exteriorRoofRails = BooleanUtils.toBooleanObject(exteriorRoofRails);
	}

	public void transformexteriorSunroof(String exteriorSunroof) {
		this.exteriorSunroof = BooleanUtils.toBooleanObject(exteriorSunroof);
	}

	public void transformexteriorPuddleLamps(String exteriorPuddleLamps) {
		this.exteriorPuddleLamps = BooleanUtils.toBooleanObject(exteriorPuddleLamps);
	}

	public void transformexteriorLEDDRLs(String exteriorLEDDRLs) {
		this.exteriorLEDDRLs = BooleanUtils.toBooleanObject(exteriorLEDDRLs);
	}

	public void transformexteriorLEDHeadlamps(String exteriorLEDHeadlamps) {
		this.exteriorLEDHeadlamps = BooleanUtils.toBooleanObject(exteriorLEDHeadlamps);
	}

	public void transformexteriorLEDTaillights(String exteriorLEDTaillights) {
		this.exteriorLEDTaillights = BooleanUtils.toBooleanObject(exteriorLEDTaillights);
	}
	
	public void transformexteriorAdjustableHeadlamps(String exteriorAdjustableHeadlamps) {
		this.exteriorAdjustableHeadlamps = BooleanUtils.toBooleanObject(exteriorAdjustableHeadlamps);
	}
	
	public void transformexteriorHalogenHeadlamps(String exteriorHalogenHeadlamps) {
		this.exteriorHalogenHeadlamps = BooleanUtils.toBooleanObject(exteriorHalogenHeadlamps);
	}

	public void transformsafetyAntilockBrakingSystemABS(String safetyAntilockBrakingSystemABS) {
		this.safetyAntilockBrakingSystemABS = BooleanUtils.toBooleanObject(safetyAntilockBrakingSystemABS);
	}

	public void transformsafetyCentralLocking(String safetyCentralLocking) {
		this.safetyCentralLocking = BooleanUtils.toBooleanObject(safetyCentralLocking);
	}

	public void transformsafetyChildSafetyLocks(String safetyChildSafetyLocks) {
		this.safetyChildSafetyLocks = BooleanUtils.toBooleanObject(safetyChildSafetyLocks);
	}

	public void transformsafetyAntiTheftAlarm(String safetyAntiTheftAlarm) {
		this.safetyAntiTheftAlarm = BooleanUtils.toBooleanObject(safetyAntiTheftAlarm);
	}

	public void transformsafetyDriverAirbag(String safetyDriverAirbag) {
		this.safetyDriverAirbag = BooleanUtils.toBooleanObject(safetyDriverAirbag);
	}

	public void transformsafetyPassengerAirbag(String safetyPassengerAirbag) {
		this.safetyPassengerAirbag = BooleanUtils.toBooleanObject(safetyPassengerAirbag);
	}

	public void transformsafetySideAirbag(String safetySideAirbag) {
		this.safetySideAirbag = BooleanUtils.toBooleanObject(safetySideAirbag);
	}

	public void transformsafetySideAirbagRear(String safetySideAirbagRear) {
		this.safetySideAirbagRear = BooleanUtils.toBooleanObject(safetySideAirbagRear);
	}

	public void transformsafetyDayNightRearViewMirror(String safetyDayNightRearViewMirror) {
		this.safetyDayNightRearViewMirror = BooleanUtils.toBooleanObject(safetyDayNightRearViewMirror);
	}

	public void transformsafetyCurtainAirbag(String safetyCurtainAirbag) {
		this.safetyCurtainAirbag = BooleanUtils.toBooleanObject(safetyCurtainAirbag);
	}

	public void transformsafetyElectronicBrakeforceDistributionEBD(String safetyElectronicBrakeforceDistributionEBD) {
		this.safetyElectronicBrakeforceDistributionEBD = BooleanUtils
				.toBooleanObject(safetyElectronicBrakeforceDistributionEBD);
	}

	public void transformsafetySeatBeltWarning(String safetySeatBeltWarning) {
		this.safetySeatBeltWarning = BooleanUtils.toBooleanObject(safetySeatBeltWarning);
	}

	public void transformsafetyDoorAjarWarning(String safetyDoorAjarWarning) {
		this.safetyDoorAjarWarning = BooleanUtils.toBooleanObject(safetyDoorAjarWarning);
	}

	public void transformsafetyTractionControl(String safetyTractionControl) {
		this.safetyTractionControl = BooleanUtils.toBooleanObject(safetyTractionControl);
	}

	public void transformsafetyTyrePressureMonitoringSystemTPMS(String safetyTyrePressureMonitoringSystemTPMS) {
		this.safetyTyrePressureMonitoringSystemTPMS = BooleanUtils
				.toBooleanObject(safetyTyrePressureMonitoringSystemTPMS);
	}

	public void transformsafetyEngineImmobilizer(String safetyEngineImmobilizer) {
		this.safetyEngineImmobilizer = BooleanUtils.toBooleanObject(safetyEngineImmobilizer);
	}

	public void transformsafetyElectronicStabilityControlESC(String safetyElectronicStabilityControlESC) {
		this.safetyElectronicStabilityControlESC = BooleanUtils.toBooleanObject(safetyElectronicStabilityControlESC);
	}

	public void transformsafetyRearCamera(String safetyRearCamera) {
		this.safetyRearCamera = BooleanUtils.toBooleanObject(safetyRearCamera);
	}

	public void transformsafetyAntiTheftDevice(String safetyAntiTheftDevice) {
		this.safetyAntiTheftDevice = BooleanUtils.toBooleanObject(safetyAntiTheftDevice);
	}

	public void transformsafetySpeedAlert(String safetySpeedAlert) {
		this.safetySpeedAlert = BooleanUtils.toBooleanObject(safetySpeedAlert);
	}

	public void transformsafetySpeedSensingAutoDoorLock(String safetySpeedSensingAutoDoorLock) {
		this.safetySpeedSensingAutoDoorLock = BooleanUtils.toBooleanObject(safetySpeedSensingAutoDoorLock);
	}

	public void transformsafetyKneeAirbags(String safetyKneeAirbags) {
		this.safetyKneeAirbags = BooleanUtils.toBooleanObject(safetyKneeAirbags);
	}

	public void transformsafetyISOFIXChildSeatMounts(String safetyISOFIXChildSeatMounts) {
		this.safetyISOFIXChildSeatMounts = BooleanUtils.toBooleanObject(safetyISOFIXChildSeatMounts);
	}

	public void transformsafetyHillAssist(String safetyHillAssist) {
		this.safetyHillAssist = BooleanUtils.toBooleanObject(safetyHillAssist);
	}

	public void transformsafetyImpactSensingAutoDoorUnlock(String safetyImpactSensingAutoDoorUnlock) {
		this.safetyImpactSensingAutoDoorUnlock = BooleanUtils.toBooleanObject(safetyImpactSensingAutoDoorUnlock);
	}

	public void transformsafety360ViewCamera(String safety360ViewCamera) {
		this.safety360ViewCamera = BooleanUtils.toBooleanObject(safety360ViewCamera);
	}
	
	public void transformsafetyBrakeAssist(String safetyBrakeAssist) {
		this.safetyBrakeAssist = BooleanUtils.toBooleanObject(safetyBrakeAssist);
	}
	
	public void transformsafetyHeadsUpDisplayHUD(String safetyHeadsUpDisplayHUD) {
		this.safetyHeadsUpDisplayHUD = BooleanUtils.toBooleanObject(safetyHeadsUpDisplayHUD);
	}
	
	public void transformsafetyHillDescentControl(String safetyHillDescentControl) {
		this.safetyHillDescentControl = BooleanUtils.toBooleanObject(safetyHillDescentControl);
	}

	public void transformentertainmentCommunicationRadio(String entertainmentCommunicationRadio) {
		this.entertainmentCommunicationRadio = BooleanUtils.toBooleanObject(entertainmentCommunicationRadio);
	}

	public void transformentertainmentCommunicationIntegrated2DINAudio(
			String entertainmentCommunicationIntegrated2DINAudio) {
		this.entertainmentCommunicationIntegrated2DINAudio = BooleanUtils
				.toBooleanObject(entertainmentCommunicationIntegrated2DINAudio);
	}

	public void transformentertainmentCommunicationWirelessPhoneCharging(
			String entertainmentCommunicationWirelessPhoneCharging) {
		this.entertainmentCommunicationWirelessPhoneCharging = BooleanUtils
				.toBooleanObject(entertainmentCommunicationWirelessPhoneCharging);
	}

	public void transformentertainmentCommunicationBluetoothConnectivity(
			String entertainmentCommunicationBluetoothConnectivity) {
		this.entertainmentCommunicationBluetoothConnectivity = BooleanUtils
				.toBooleanObject(entertainmentCommunicationBluetoothConnectivity);
	}

	public void transformentertainmentCommunicationTouchscreen(String entertainmentCommunicationTouchscreen) {
		this.entertainmentCommunicationTouchscreen = BooleanUtils
				.toBooleanObject(entertainmentCommunicationTouchscreen);
	}

	public void transformentertainmentCommunicationAndroidAuto(String entertainmentCommunicationAndroidAuto) {
		this.entertainmentCommunicationAndroidAuto = BooleanUtils
				.toBooleanObject(entertainmentCommunicationAndroidAuto);
	}

	public void transformentertainmentCommunicationAppleCarPlay(String entertainmentCommunicationAppleCarPlay) {
		this.entertainmentCommunicationAppleCarPlay = BooleanUtils
				.toBooleanObject(entertainmentCommunicationAppleCarPlay);
	}

	public void transformentertainmentCommunicationUsbPorts(String entertainmentCommunicationUsbPorts) {
		this.entertainmentCommunicationUsbPorts = BooleanUtils.toBooleanObject(entertainmentCommunicationUsbPorts);
	}

	public void transformentertainmentCommunicationInbuiltApps(String entertainmentCommunicationInbuiltApps) {
		this.entertainmentCommunicationInbuiltApps = BooleanUtils
				.toBooleanObject(entertainmentCommunicationInbuiltApps);
	}

	public void transformentertainmentCommunicationAdditionalFeatures(
			String entertainmentCommunicationAdditionalFeatures) {
		this.entertainmentCommunicationAdditionalFeatures = BooleanUtils
				.toBooleanObject(entertainmentCommunicationAdditionalFeatures);
	}

	public void transformentertainmentCommunicationSpeakers(String entertainmentCommunicationSpeakers) {
		this.entertainmentCommunicationSpeakers = BooleanUtils.toBooleanObject(entertainmentCommunicationSpeakers);
	}

	public void transformaDASFeatureForwardCollisionWarning(String aDASFeatureForwardCollisionWarning) {
		this.aDASFeatureForwardCollisionWarning = BooleanUtils.toBooleanObject(aDASFeatureForwardCollisionWarning);
	}

	public void transformaDASFeatureBlindSpotCollisionAvoidanceAssist(
			String aDASFeatureBlindSpotCollisionAvoidanceAssist) {
		this.aDASFeatureBlindSpotCollisionAvoidanceAssist = BooleanUtils
				.toBooleanObject(aDASFeatureBlindSpotCollisionAvoidanceAssist);
	}

	public void transformaDASFeatureLaneDepartureWarning(String aDASFeatureLaneDepartureWarning) {
		this.aDASFeatureLaneDepartureWarning = BooleanUtils.toBooleanObject(aDASFeatureLaneDepartureWarning);
	}

	public void transformaDASFeatureLaneKeepAssist(String aDASFeatureLaneKeepAssist) {
		this.aDASFeatureLaneKeepAssist = BooleanUtils.toBooleanObject(aDASFeatureLaneKeepAssist);
	}

	public void transformaDASFeatureDriverAttentionWarning(String aDASFeatureDriverAttentionWarning) {
		this.aDASFeatureDriverAttentionWarning = BooleanUtils.toBooleanObject(aDASFeatureDriverAttentionWarning);
	}

	public void transformaDASFeatureAdaptiveCruiseControl(String aDASFeatureAdaptiveCruiseControl) {
		this.aDASFeatureAdaptiveCruiseControl = BooleanUtils.toBooleanObject(aDASFeatureAdaptiveCruiseControl);
	}

	public void transformaDASFeatureLeadingVehicleDepartureAlert(String aDASFeatureLeadingVehicleDepartureAlert) {
		this.aDASFeatureLeadingVehicleDepartureAlert = BooleanUtils
				.toBooleanObject(aDASFeatureLeadingVehicleDepartureAlert);
	}

	public void transformaDASFeatureAdaptiveHighBeamAssist(String aDASFeatureAdaptiveHighBeamAssist) {
		this.aDASFeatureAdaptiveHighBeamAssist = BooleanUtils.toBooleanObject(aDASFeatureAdaptiveHighBeamAssist);
	}

	public void transformaDASFeatureRearCrossTrafficAlert(String aDASFeatureRearCrossTrafficAlert) {
		this.aDASFeatureRearCrossTrafficAlert = BooleanUtils.toBooleanObject(aDASFeatureRearCrossTrafficAlert);
	}

	public void transformaDASFeatureRearCrossTrafficCollisionAvoidanceAssist(
			String aDASFeatureRearCrossTrafficCollisionAvoidanceAssist) {
		this.aDASFeatureRearCrossTrafficCollisionAvoidanceAssist = BooleanUtils
				.toBooleanObject(aDASFeatureRearCrossTrafficCollisionAvoidanceAssist);
	}

	public void transformaDASFeatureBlindSpotMonitor(String aDASFeatureBlindSpotMonitor) {
		this.aDASFeatureBlindSpotMonitor = BooleanUtils.toBooleanObject(aDASFeatureBlindSpotMonitor);
	}

	public void transformadvanceInternetFeatureLiveLocation(String advanceInternetFeatureLiveLocation) {
		this.advanceInternetFeatureLiveLocation = BooleanUtils.toBooleanObject(advanceInternetFeatureLiveLocation);
	}

	public void transformadvanceInternetFeatureECallICall(String advanceInternetFeatureECallICall) {
		this.advanceInternetFeatureECallICall = BooleanUtils.toBooleanObject(advanceInternetFeatureECallICall);
	}

	public void transformadvanceInternetFeatureOvertheAirOTAUpdates(String advanceInternetFeatureOvertheAirOTAUpdates) {
		this.advanceInternetFeatureOvertheAirOTAUpdates = BooleanUtils
				.toBooleanObject(advanceInternetFeatureOvertheAirOTAUpdates);
	}

	public void transformadvanceInternetFeatureGoogleAlexaConnectivity(
			String advanceInternetFeatureGoogleAlexaConnectivity) {
		this.advanceInternetFeatureGoogleAlexaConnectivity = BooleanUtils
				.toBooleanObject(advanceInternetFeatureGoogleAlexaConnectivity);
	}

	public void transformadvanceInternetFeatureSOSButton(String advanceInternetFeatureSOSButton) {
		this.advanceInternetFeatureSOSButton = BooleanUtils.toBooleanObject(advanceInternetFeatureSOSButton);
	}

	public void transformadvanceInternetFeatureRSA(String advanceInternetFeatureRSA) {
		this.advanceInternetFeatureRSA = BooleanUtils.toBooleanObject(advanceInternetFeatureRSA);
	}

	public void transformadvanceInternetFeatureRemoteImmobiliser(String advanceInternetFeatureRemoteImmobiliser) {
		this.advanceInternetFeatureRemoteImmobiliser = BooleanUtils
				.toBooleanObject(advanceInternetFeatureRemoteImmobiliser);
	}

	public void transformadvanceInternetFeatureSendPOItoVehicleFromApp(
			String advanceInternetFeatureSendPOItoVehicleFromApp) {
		this.advanceInternetFeatureSendPOItoVehicleFromApp = BooleanUtils
				.toBooleanObject(advanceInternetFeatureSendPOItoVehicleFromApp);
	}

	public void transformadvanceInternetFeatureOverSpeedingAlert(String advanceInternetFeatureOverSpeedingAlert) {
		this.advanceInternetFeatureOverSpeedingAlert = BooleanUtils
				.toBooleanObject(advanceInternetFeatureOverSpeedingAlert);
	}

	public void transformadvanceInternetFeatureTowAwayAlert(String advanceInternetFeatureTowAwayAlert) {
		this.advanceInternetFeatureTowAwayAlert = BooleanUtils.toBooleanObject(advanceInternetFeatureTowAwayAlert);
	}

	public void transformadvanceInternetFeatureSmartwatchApp(String advanceInternetFeatureSmartwatchApp) {
		this.advanceInternetFeatureSmartwatchApp = BooleanUtils.toBooleanObject(advanceInternetFeatureSmartwatchApp);
	}

	public void transformadvanceInternetFeatureValetMode(String advanceInternetFeatureValetMode) {
		this.advanceInternetFeatureValetMode = BooleanUtils.toBooleanObject(advanceInternetFeatureValetMode);
	}

	public void transformadvanceInternetFeatureRemoteACOnOff(String advanceInternetFeatureRemoteACOnOff) {
		this.advanceInternetFeatureRemoteACOnOff = BooleanUtils.toBooleanObject(advanceInternetFeatureRemoteACOnOff);
	}

	public void transformadvanceInternetFeatureRemoteDoorLockUnlock(String advanceInternetFeatureRemoteDoorLockUnlock) {
		this.advanceInternetFeatureRemoteDoorLockUnlock = BooleanUtils
				.toBooleanObject(advanceInternetFeatureRemoteDoorLockUnlock);
	}

	public void transformadvanceInternetFeatureSOSEmergencyAssistance(
			String advanceInternetFeatureSOSEmergencyAssistance) {
		this.advanceInternetFeatureSOSEmergencyAssistance = BooleanUtils
				.toBooleanObject(advanceInternetFeatureSOSEmergencyAssistance);
	}

	public void transformadvanceInternetFeatureGeofenceAlert(String advanceInternetFeatureGeofenceAlert) {
		this.advanceInternetFeatureGeofenceAlert = BooleanUtils.toBooleanObject(advanceInternetFeatureGeofenceAlert);
	}

}
