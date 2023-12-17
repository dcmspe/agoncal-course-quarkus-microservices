package org.agoncal.quarkus.microservices.number;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.time.Instant;

@Data
@NoArgsConstructor
@Schema(description = "Several ISBN numbers for books")
public class IsbnNumbers {

  @Schema(required = true)
  @JsonbProperty("isbn_10")
  private String isbn10;
  @Schema(required = true)
  @JsonbProperty("isbn_13")
  private String isbn13;
  @JsonbTransient
  private Instant generationDate;

}
