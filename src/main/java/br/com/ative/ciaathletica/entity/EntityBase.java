package br.com.ative.ciaathletica.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class EntityBase implements IEntity {
	private static final long serialVersionUID = -5472668685736641598L;
	
	@Getter @Setter
	@Enumerated(EnumType.STRING)
	@Column(length=20,nullable=false)
	private Status status;
	
}
