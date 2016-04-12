package device;

public interface Authenticatable
{
	// Overloading methods
	
	public void checkDatabase(int code);
	public boolean checkDatabase(String name);

	// Any other method 
	
	public boolean validateInformation(String userName, String password);
}
