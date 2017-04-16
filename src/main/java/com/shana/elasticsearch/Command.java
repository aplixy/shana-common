package com.shana.elasticsearch;

public class Command {
	private String index;
	private String type;
	private String queryString;
	private Method method;
	private Object httpBody;
	
	public enum Method{
		POST,DELETE,GET,PUT,PATCH		
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Object getHttpBody() {
		return httpBody;
	}

	public void setHttpBody(Object httpBody) {
		this.httpBody = httpBody;
	}

	
}
