package auto.data.model;

import lombok.Data;

@Data
public class AdasFeature {
	private boolean forwardCollisionWarning;
	private boolean blindSpotCollisionAvoidanceAssist;
	private boolean laneDepartureWarning;
	private boolean laneKeepAssist;
	private boolean driverAttentionWarning;
	private boolean adaptiveCruiseControl;
	private boolean leadingVehicleDepartureAlert;
	private boolean adaptiveHighBeamAssist;
	private boolean rearCrossTrafficAlert;
	private boolean rearCrossTrafficCollisionAvoidanceAssist;
	private boolean blindSpotMonitor;
}
