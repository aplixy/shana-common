package com.shana.httpclient;

public class HttpResponse {
	
	private Object content;
	private int status;
	
	
	public HttpResponse(Object content, int status) {
		super();
		this.content = content;
		this.status = status;
	}
	
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
