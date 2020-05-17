package com.eqarus.sentiment.mail.response;

import java.util.Map;

public class MailResponseBean {
	
	 private static final long serialVersionUID = 2263167344670024172L;
	    
	    private Integer statusCode;

	    private Map<String, String> headers;
	    
	    private String body;

	    private Boolean isBase64Encoded;

		public Integer getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(Integer statusCode) {
			this.statusCode = statusCode;
		}

		public Map<String, String> getHeaders() {
			return headers;
		}

		public void setHeaders(Map<String, String> headers) {
			this.headers = headers;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public Boolean getIsBase64Encoded() {
			return isBase64Encoded;
		}

		public void setIsBase64Encoded(Boolean isBase64Encoded) {
			this.isBase64Encoded = isBase64Encoded;
		}

}
