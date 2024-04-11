/**
 * 
 */
package com.br.sobieskiproducoes.geradormateriasjoomla.chatgpt.consumer.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jorge Demetrio
 * @since 11 de abr. de 2024 00:21:22
 * @version 1.0-11 de abr. de 2024
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NextStepDataStepDetailsResponseDTO {
  private String type;// ": "message_creation",
  @JsonProperty("message_creation")
  private NextStepDataStepDetailsMessageCreationResponseDTO messageCreation;
}
