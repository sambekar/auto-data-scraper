package auto.data.model;

import lombok.Data;

@Data
public enum EmissionNormEnum {
	BS1("2000-2005"),
	BS2("2005-2010"),
	BS3("2010-2017"),
	BS4("2017-2020"),
	BS6("2020-2023"),
	BS6P2("2023-2025");
	private final String description;

    EmissionNormEnum(String desc) {
		this.description = desc;
	}

	
}
