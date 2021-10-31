package com.mercadolivre.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * ErrorDto
 */
@Validated
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

}
