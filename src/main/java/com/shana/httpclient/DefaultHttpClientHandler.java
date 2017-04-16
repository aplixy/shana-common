package com.shana.httpclient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

public class DefaultHttpClientHandler implements HttpClientHandler{

	@Override
	public HttpResponse getWithForm(String url, Map<String, String> headers, Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse getWithForm(String url, Map<String, String> headers, Map<String, String> params,
			String sessionId) throws Exception {
		URIBuilder builder=new URIBuilder(url);
		if(null!=params)
		{
			params.forEach((key,value)->{builder.addParameter(key, value);});
		}
		HttpGet httpGet=new HttpGet(builder.build());
		return doRequest(httpGet,headers,sessionId);
	}

	private HttpResponse doRequest(HttpUriRequest httpRequest, Map<String, String> headers,String sessionId) throws Exception{
		addHeader(httpRequest,headers);
		HttpClient httpClient=getHttpClient(sessionId);
		return executeRequest(httpClient,httpRequest);
	}

	private HttpResponse executeRequest(HttpClient httpClient, HttpUriRequest httpRequest) throws Exception {
			
			org.apache.http.HttpResponse response = httpClient.execute(httpRequest);
            String content=EntityUtils.toString(response.getEntity());
            int status=response.getStatusLine().getStatusCode();
             return new HttpResponse(content,status);
	
	}

	private void addHeader(HttpUriRequest httpRequest, Map<String, String> headers) {
		if(null!=headers)
		{
			headers.forEach((key,value)->{httpRequest.addHeader(key, value);});			
		}
		
	}

	private HttpClient getHttpClient(String sessionId) {
		//HttpClient httpClient=new CloseableHttpClient();
		return null;
	}

	@Override
	public HttpResponse putWithJson(String url, Map<String, String> headers, Object httpBody) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse putWithJson(String url, Map<String, String> headers, Object httpBody, String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse postWithForm(String url, Map<String, String> headers, Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse postWithForm(String url, Map<String, String> headers, Map<String, String> params,
			String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse postWithJson(String url, Map<String, String> headers, Object httpBody) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse postWithJson(String url, Map<String, String> headers, Object httpBody, String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse deleteWithForm(String url, Map<String, String> headers, Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse deleteWithForm(String url, Map<String, String> headers, Map<String, String> params,
			String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse patchWithJson(String url, Map<String, String> headers, Object httpBody) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse patchWithJson(String url, Map<String, String> headers, Object httpBody, String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
