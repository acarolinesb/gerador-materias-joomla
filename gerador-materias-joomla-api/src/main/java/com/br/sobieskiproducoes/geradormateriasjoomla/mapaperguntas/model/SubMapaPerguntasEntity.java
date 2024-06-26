/**
 *
 */
package com.br.sobieskiproducoes.geradormateriasjoomla.mapaperguntas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jorge Demetrio
 * @since 24 de fev. de 2024 12:56:12
 * @version 1.0.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_mapa_subperguntas")
public class SubMapaPerguntasEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "uuid_requisicao", nullable = true, insertable = true, updatable = true, unique = false, length = 1000)
  private String uuid;

  @Column(name = "pergunta", nullable = false, insertable = true, updatable = true, unique = false, length = 3000)
  private String pergunta;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_mapa_pergunta", nullable = false, insertable = true, updatable = true, unique = false)
  private MapaPerguntaEntity peguntaPrincipal;
}
