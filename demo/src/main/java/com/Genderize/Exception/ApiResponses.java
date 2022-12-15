package com.Genderize.Exception;

public class ApiResponses {
	 private String message;
	    private boolean status;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public ApiResponses(String message, boolean status) {
			super();
			this.message = message;
			this.status = status;
		}
		public ApiResponses() {
			super();
			// TODO Auto-generated constructor stub
		}
	}


