package auto.data.model;

import lombok.Data;

@Data
public class EngineAndTransmission {
	private String engineType;//Engine type in car refers to the type of engine that powers the vehicle. There are many different types of car engines, but the most common are petrol (gasoline) and diesel engines
	private int displacement;//The displacement of an engine is the total volume of all of the cylinders in the engine. Measured in cubic centimetres (cc)
	private Power maxPower;//Power dictates the performance of an engine. It's measured in horsepower (bhp) or metric horsepower (PS). More is better.
	private Torque maxTorque;//The load-carrying ability of an engine, measured in Newton-metres (Nm) or pound-foot (lb-ft). More is better.
	private int noOfCylinders;//ICE engines have one or more cylinders. More cylinders typically mean more smoothness and more power, but it also means more moving parts and less fuel efficiency.
	private int valvesPerCylinder;//The number of intake and exhaust valves in each engine cylinder. More valves per cylinder means better engine breathing and better performance but it also adds to cost.
	private String valveConfiguration;//Valve configuration refers to the number and arrangement of intake and exhaust valves in each engine cylinder.
	private String fuelSupplySystem;//Responsible for delivering fuel from the fuel tank into your internal combustion engine (ICE). More sophisticated systems give you better mileage.
	private boolean turboCharger;//A device that forces more air into an internal combustion engine. More air can burn more fuel and make more power. Turbochargers utilise exhaust gas energy to make more power.
	private TransmissionTypeEnum transmissionType;
	private int numberOfGears; //The component containing a set of gears that supply power from the engine to the wheels. It affects speed and fuel efficiency.
	private DriveTypeEnum driveType;

}
