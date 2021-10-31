package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * DnaCreate
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class DnaCreateRequestDto {
  @Schema(description = "Sequence of DNA",
          example = "[\"CTGAGA\", \"CTATGC\", \"TATTGT\", \"AGAGGG\", \"CCCCTA\", \"TCACTG\"]", required = true)
  @JsonProperty("dna")
  @Valid
  private List<String> bases;

}
