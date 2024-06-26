/**
 *
 */
package com.br.sobieskiproducoes.geradormateriasjoomla.materia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jorge Demetrio
 * @since 21 de fev. de 2024 17:27:09
 * @version 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_categoria")
public class CategoriaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "id_joomla", nullable = false, insertable = true, updatable = true, unique = true)
  private Long idJoomla;

  @Column(name = "titulo", nullable = false, insertable = true, updatable = true, unique = false, length = 1000)
  private String titulo;

  @Column(name = "alias", nullable = false, insertable = true, updatable = true, unique = false, length = 1000)
  private String apelido;

  @Column(name = "usar_prompts", nullable = true, insertable = true, updatable = true, unique = false, columnDefinition = " tinyint(1) DEFAULT 1 ")
  private Boolean usarEmPrompts = Boolean.TRUE;

  @ManyToOne
  @JoinColumn(name = "id_pai")
  private CategoriaEntity pai;




}
