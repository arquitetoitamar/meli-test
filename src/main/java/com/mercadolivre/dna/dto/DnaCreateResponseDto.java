package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * DnaCreateResponse
 */
@Validated
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DnaCreateResponseDto {
  @JsonProperty("is_simian")
  private Boolean isSimian;
}
