package com.Genderize.Exception;

public class ApiException extends RuntimeException {
	 private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public ApiException(String message) {
			super();
			this.message = message;
		}

		public ApiException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public ApiException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public ApiException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		} 
	}


