package au.com.jaylin.pimon.rest;

public class ReadMessageException extends RuntimeException {
	private static final long serialVersionUID = 2224196102118899600L;

	public ReadMessageException(String message) {
		super(message);	
	}
}
