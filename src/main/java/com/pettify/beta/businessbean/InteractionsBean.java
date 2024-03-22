package com.pettify.beta.businessbean;

public class InteractionsBean {
	
	private Integer interactionId;
	private Integer senderId;
	private Integer receiverId;
	private String reason;
	private String status;
	
	
	public InteractionsBean() {
		super();
		}


	public InteractionsBean(Integer interactionId, Integer senderId, Integer receiverId, String reason, String status) {
		super();
		this.interactionId = interactionId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.reason = reason;
		this.status = status;
	}


	public Integer getInteractionId() {
		return interactionId;
	}


	public void setInteractionId(Integer interactionId) {
		this.interactionId = interactionId;
	}


	public Integer getSenderId() {
		return senderId;
	}


	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}


	public Integer getReceiverId() {
		return receiverId;
	}


	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
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


	@Override
	public String toString() {
		return "InteractionsBean [interactionId=" + interactionId + ", senderId=" + senderId + ", receiverId="
				+ receiverId + ", reason=" + reason + ", status=" + status + "]";
	}
	
}
