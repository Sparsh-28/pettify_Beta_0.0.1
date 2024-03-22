package com.pettify.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Interaction")
public class InteractionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String reason;
	private String status;
	
	@JoinColumn(name = "sender", referencedColumnName = "id")
	@OneToOne
	private UserEntity sender;
	
	@JoinColumn(name = "receiver", referencedColumnName = "id")
	@OneToOne
	private UserEntity receiver;

	public InteractionEntity(String reason, String status, UserEntity sender, UserEntity receiver) {
		super();
		this.reason = reason;
		this.status = status;
		this.sender = sender;
		this.receiver = receiver;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserEntity getSender() {
		return sender;
	}

	public void setSender(UserEntity sender) {
		this.sender = sender;
	}

	public UserEntity getReceiver() {
		return receiver;
	}

	public void setReceiver(UserEntity receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "InteractionEntity [id=" + id + ", reason=" + reason + ", status=" + status + ", sender=" + sender
				+ ", receiver=" + receiver + "]";
	}
}
