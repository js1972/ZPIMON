package au.com.jaylin.persistence.ejbs.helpers;

public class TimestampException extends RuntimeException {
	private static final long serialVersionUID = -9095896542744955570L;

	public TimestampException(String message) {
		super(message);	
	}
}
