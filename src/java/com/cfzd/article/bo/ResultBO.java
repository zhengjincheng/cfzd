package com.cfzd.article.bo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class ResultBO implements Serializable {
	@XmlElement
	private Boolean isSuccess;
	@XmlElement
	private String message;
	@XmlElement
	private String code;
	

	public Boolean getIsSuccess() {
		return isSuccess;
	}
	@XmlElement
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	@XmlElement
	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	@XmlElement
	public void setCode(String code) {
		this.code = code;
	}

}
