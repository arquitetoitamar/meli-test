package com.mercadolivre.dna.model;

import com.mercadolivre.dna.enumerator.DnaType;
import lombok.*;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * DnaCreateResponse
 */
@Validated
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Node("nucleo")
public class Nucleo {
  @Id
  private String dnaSequence;
  @Property(name = "dnaType")
  private DnaType dnaType;
  @Relationship(type="CODON_IN", direction= Relationship.Direction.OUTGOING)
  private List<Codon> tape;
}
