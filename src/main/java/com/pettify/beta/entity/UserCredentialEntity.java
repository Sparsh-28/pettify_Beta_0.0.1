package com.pettify.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserCredential")
public class UserCredentialEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "useremail", referencedColumnName = "email")
	private UserEntity useremail;
	
	private String password;

	public UserCredentialEntity(UserEntity useremail, String password) {
		super();
		this.useremail = useremail;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserEntity getUseremail() {
		return useremail;
	}

	public void setUseremail(UserEntity useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentialEntity [id=" + id + ", useremail=" + useremail + ", password=" + password + "]";
	}
	
}

