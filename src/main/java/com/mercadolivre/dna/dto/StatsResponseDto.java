package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.validation.annotation.Validated;

/**
 * StatsResponse
 */
@Validated
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StatsResponseDto {
  @JsonProperty("count_simian_dna")
  private Integer countSimianDna;

  @JsonProperty("count_human_dna")
  private Integer countHumanDna;

  @JsonProperty("ratio")
  private Double ratio;
}
