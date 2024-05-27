package co.com.tascon.curso.MicroservicioSpringCurso.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("MicroservicioSpringCurso")
@org.springframework.context.annotation.Configuration
public class Configuration {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}