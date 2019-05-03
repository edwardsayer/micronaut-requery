package hello.world.service;

import javax.validation.constraints.NotBlank;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db")
public class DbConfig {
	@NotBlank
	String url = "";
	@NotBlank
	String username = "";
	@NotBlank
	String password = "";
}