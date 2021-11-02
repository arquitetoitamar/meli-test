package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * DnaCreate
 */
@Builder
@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Validated
public class DnaCreateRequestDto {
  @Schema(description = "Sequence of DNA",
          example = "[\"CTGAGA\", \"CTATGC\", \"TATTGT\", \"AGAGGG\", \"CCCCTA\", \"TCACTG\"]", required = true)
  @JsonProperty("dna")
  @Valid
  @NotBlank
  @NotNull
  private List<@NotBlank @NotNull @Pattern(regexp="^[ATCG]{6}$") String> bases;

}
