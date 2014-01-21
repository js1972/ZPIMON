package au.com.jaylin.persistence.ejbs;

public class ReadMessageLogException extends RuntimeException {
	private static final long serialVersionUID = 2256770985682073640L;

	public ReadMessageLogException(String message) {
		super(message);	
	}
}
