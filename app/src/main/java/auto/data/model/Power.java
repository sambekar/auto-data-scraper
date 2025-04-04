package auto.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Power {
	private double bhp;
	private int rpm;
	private String stringRepresentation;
}
