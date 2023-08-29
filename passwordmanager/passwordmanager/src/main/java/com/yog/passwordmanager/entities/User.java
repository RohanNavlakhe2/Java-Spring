package com.yog.passwordmanager.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "\"user\"")
public class User {

	@Id
	@Email
	private String emaildId;

	@NotBlank
	private String password;

	public User(@Email String emaildId, @NotBlank String password) {
		super();
		this.emaildId = emaildId;
		this.password = password;
	}

	public String getEmaildId() {
		return emaildId;
	}

	public void setEmaildId(String emaildId) {
		this.emaildId = emaildId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emaildId, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emaildId, other.emaildId) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "User [emaildId=" + emaildId + ", password=" + password + "]";
	}

}
