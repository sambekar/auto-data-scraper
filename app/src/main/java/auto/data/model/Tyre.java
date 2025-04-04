package auto.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Tyre {
	private  int tireWidth;
    private  int aspectRatio;
    private  int rimDiameter;
    private String stringRepresentation;
}
