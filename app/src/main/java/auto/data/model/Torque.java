package auto.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Torque {
	private double nm;
	private int rpm;
	private String stringRepresentation;
}
