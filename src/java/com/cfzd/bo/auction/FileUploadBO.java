package com.cfzd.bo.auction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FileUpload")
public class FileUploadBO extends  ResultBO {
	@XmlElement
	private Integer id;
	@XmlElement
	private String uri;

	public Integer getId() {
		return id;
	}

	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	@XmlElement
	public void setUri(String uri) {
		this.uri = uri;
	}

}
