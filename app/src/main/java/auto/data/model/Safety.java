package auto.data.model;

import lombok.Data;

@Data
public class Safety {
	private boolean antiLockBrakingSystem;
	private boolean centralLocking;
	private boolean childSafetyLocks;
	private boolean antiTheftAlarm;
	private int noOfAirbags;
	private boolean driverAirbag;
	private boolean passengerAirbag;
	private boolean sideAirbag;
	private boolean sideAirbagRear;
	private boolean dayNightRearViewMirror;
	private boolean curtainAirbag;
	private boolean electronicBrakeforceDistribution;
	private boolean seatBeltWarning;
	private boolean doorAjarWarning;
	private boolean tractionControl;
	private boolean tyrePressureMonitoringSystem;
	private boolean engineImmobilizer;
	private boolean electronicStabilityControl;
	private boolean rearCamera;
	private boolean antiTheftDevice;
	private boolean speedAlert;
	private boolean speedSensingAutoDoorLock;
	private boolean kneeAirbags;
	private boolean isofixChildSeatMounts;
	private String pretensionersAndForceLimiterSeatbelts;
	private boolean hillAssist;
	private boolean impactSensingAutoDoorUnlock;
	private boolean threeSixtyViewCamera;
	private int globalNcapSafetyRating;
	private int globalNcapChildSafetyRating;

}
