package interfaces;

public interface Authenticatable{
    
    public boolean validateInformation(String userName, String password);
    
    public void checkDatabase();
	public boolean checkDatabase(String name);
}
