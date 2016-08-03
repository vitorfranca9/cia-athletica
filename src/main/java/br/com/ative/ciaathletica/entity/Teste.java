package br.com.ative.ciaathletica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.SQLDelete;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@SQLDelete(sql="update teste set status = 'INATIVO' where idteste = ?")
public class Teste extends EntityBase {
	private static final long serialVersionUID = -6376570236857946964L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idteste")
	@Getter @Setter 
	private Integer id;
	
	@Getter @Setter 
	@Column(length=50)
	private String nome;
	
	@Getter @Setter 
	private String descricao;
	
}
