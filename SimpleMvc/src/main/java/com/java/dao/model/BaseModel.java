package com.java.dao.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseModel {

	  @Id
	  @Column(name="ID_ENTITY")
	  @GeneratedValue(strategy=GenerationType.AUTO, generator="idSequence")
	  @SequenceGenerator(name="idSequence", sequenceName="ID_SEQUENCE", allocationSize=50)
	  private Long id;
	
	  @Temporal(TemporalType.TIMESTAMP)
	  @Basic(optional=true)
	  @Column(name="DAT_CREATION", nullable=true, updatable=false)
	  private Date creationDate;
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  @Basic(optional=true)
	  @Column(name="DAT_LAST_UPDATE", nullable=true, updatable=false)
	  private Date updationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	  
	  
}
