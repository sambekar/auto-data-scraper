package auto.data.model;

import lombok.Data;

@Data
public enum TransmissionTypeEnum {
	MANUAL("Manual Transmission"),
	IMT("Intelligent manual transmission"),
	AMT("Automated manual transmission"),
	AT("Automatic transmission"),
	CVT("Continuously variable transmission"),
	SAT("SemiAutomatic transmission"),
	DCT("Dual-clutch transmission"),
	ST("Sequential transmission"),
	TCT("Torque converter transmission"),
	TTT("Tiptronic transmission");
	private final String description;

    TransmissionTypeEnum(String desc) {
		this.description = desc;
	}

	
}
