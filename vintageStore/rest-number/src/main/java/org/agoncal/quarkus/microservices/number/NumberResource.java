package org.agoncal.quarkus.microservices.number;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.time.Instant;
import java.util.Random;

@Slf4j
@Path("/api/numbers")
@Tag(name = "NUmber REST Endpoint")
public class NumberResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
      summary = "Generates book numbers",
      description = "ISBN 13 and ISBN 10 numbers"
    )

    public IsbnNumbers generateIsbnNumbers(){
      IsbnNumbers isbnNumbers = new IsbnNumbers();
      isbnNumbers.setIsbn13(new StringBuilder().append("13 -").append(new Random().nextInt(100_000_000)).toString());
      isbnNumbers.setIsbn10(new StringBuilder().append("10 -").append(new Random().nextInt(100_000)).toString());
      isbnNumbers.setGenerationDate(Instant.now());
      log.info(new StringBuilder().append("Numbers generated ").append(isbnNumbers).toString());
      return isbnNumbers;
    }
}
