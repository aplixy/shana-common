package com.shana.httpclient;

import java.util.Map;

public interface HttpClientHandler {

	public HttpResponse getWithForm(String url,Map<String,String> headers,Map<String,String> params) throws Exception;
	public HttpResponse getWithForm(String url,Map<String,String> headers,Map<String,String> params,String sessionId) throws Exception;
	public HttpResponse putWithJson(String url,Map<String,String> headers,Object httpBody) throws Exception;
	public HttpResponse putWithJson(String url,Map<String,String> headers,Object httpBody,String sessionId) throws Exception;
	public HttpResponse postWithForm(String url,Map<String,String> headers,Map<String,String> params) throws Exception;
	public HttpResponse postWithForm(String url,Map<String,String> headers,Map<String,String> params,String sessionId) throws Exception;
	public HttpResponse postWithJson(String url,Map<String,String> headers,Object httpBody) throws Exception;
	public HttpResponse postWithJson(String url,Map<String,String> headers,Object httpBody,String sessionId) throws Exception;
	public HttpResponse deleteWithForm(String url,Map<String,String> headers,Map<String,String> params) throws Exception;
	public HttpResponse deleteWithForm(String url,Map<String,String> headers,Map<String,String> params,String sessionId) throws Exception;
	public HttpResponse patchWithJson(String url,Map<String,String> headers,Object httpBody) throws Exception;
	public HttpResponse patchWithJson(String url,Map<String,String> headers,Object httpBody,String sessionId) throws Exception;
}
