package com.example.testdahmeninourhene.Config;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {


        @Bean
        public OpenAPI springShopOpenAPI() {
            return new OpenAPI()
                    .info(infoAPI());

        }
        public Info infoAPI() {
            return new Info().title("Test Spring")
                    .description("TP pratique")
                    .contact(contactAPI());

        }
        public Contact contactAPI() {
            Contact contact = new Contact().name("Nourhene Dahmeni")
                    .email("dahmeninourhene@gmail.com")
                    .url("https://www.linkedin.com/in/nourhene-dahmeni-47a014234/");
            return contact;
        }
}

