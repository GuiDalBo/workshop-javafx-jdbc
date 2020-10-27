package db;

public class DbIngegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIngegrityException(String msg) {
		super(msg);
	}
}
