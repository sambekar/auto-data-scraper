package auto.data.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Price {
	private BigDecimal exShowroomPrice;
	private BigDecimal rTO;
	private BigDecimal insurance;
	private BigDecimal others;
	private BigDecimal optional;
	private BigDecimal onRoadPrice;
}
