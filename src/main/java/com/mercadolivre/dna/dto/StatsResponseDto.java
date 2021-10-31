package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;

/**
 * StatsResponse
 */
@Validated
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatsResponseDto {
  @JsonProperty("count_simian_dna")
  private Integer countSimianDna;

  @JsonProperty("count_human_dna")
  private Integer countHumanDna;

  @JsonProperty("ratio")
  private Double ratio;

  public StatsResponseDto(Object model) {
      BeanUtils.copyProperties(model, this);
  }
}
