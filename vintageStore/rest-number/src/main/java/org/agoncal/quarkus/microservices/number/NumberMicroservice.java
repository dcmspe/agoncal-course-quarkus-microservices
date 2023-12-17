package org.agoncal.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(info = @Info(title = "Number Microservice",
  description = "This microservice generates book numbers",
  version = "0.1-SNAPSHOT",
  contact = @Contact(name = "@agoncal", url = "https://twitter.com/agoncal"
  )),
  externalDocs =  @ExternalDocumentation(url = "https://github.com/dcmspe/agoncal-course-quarkus-microservices",
    description = "All the Microservice code"),
    tags = {
      @Tag(name = "api", description = "Public API tjat can be used by anybody"),
      @Tag(name="numbers", description = "Anybody interested in numbers")
    }
)

public class NumberMicroservice extends Application {
}
