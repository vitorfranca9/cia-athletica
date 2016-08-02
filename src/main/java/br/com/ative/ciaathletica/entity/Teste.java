package br.com.ative.ciaathletica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
public class Teste implements IEntity {
	private static final long serialVersionUID = -6376570236857946964L;

	@Id @Column(name="idteste") @GeneratedValue(strategy=GenerationType.IDENTITY)
//	@SequenceGenerator(initialValue=2, name = "SQ_TESTE")
	@Getter @Setter private Integer id;
	@Getter @Setter private String nome;
	@Getter @Setter private String descricao;
	
}
