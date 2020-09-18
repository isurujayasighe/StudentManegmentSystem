package com.isuru.studentbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("com.isuru.studentbackend.controller")
@ComponentScan("com.isuru.studentbackend.service")
public class StudentBackendApplication {

	@Bean
	public Docket swaggerApiDocumentation(){
		return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false)
				.groupName("Api")
				.ignoredParameterTypes(ApiIgnore.class)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.isuru.studentbackend.controller"))
				.build()
				.pathMapping("/");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Student System Backend API Documentation")
				.description("API Documentation")
				.version("2.7.0")
				.build();
	}


	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}

}
