package org.blynder.data.http.request.components;

/**
 * 
 * The request object is a container for the URL and the petition method of the
 * data module.
 *
 */
public class Request {

	private String url;
	private String method;
	
	public Request(String url, String method) {
		this.url = url;
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}
		
}
