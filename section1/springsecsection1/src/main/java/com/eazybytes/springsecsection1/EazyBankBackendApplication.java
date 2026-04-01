package com.eazybytes.springsecsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.eazybytes.springsecsection1.controller")
public class EazyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankBackendApplication.class, args);
	}

}

########################################################################################################################################################

@SpringBootApplication is a convenience annotation that includes:

@Configuration

@EnableAutoConfiguration

@ComponentScan (default is current package and sub-packages)

Adding @ComponentScan(basePackages = {...}) overrides the default scanning behavior, allowing you to include additional packages explicitly.

example

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.services"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

src/main/java
└── com/example
    ├── demo
    │   └── Application.java
    └── services
        └── MyService.java


	
