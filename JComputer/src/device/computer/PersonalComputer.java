package device.computer;

import interfaces.Authenticatable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonalComputer extends Computer implements Authenticatable{
    private ArrayList<String> users;
    private ArrayList<String> passwords;
    private final String name;

    public PersonalComputer() {
        super("Windows 10", 1000, 1.1);
        this.name = "BMO";
    }
    
    public void exeGame(){
        // execute game 
    }
    
    public void createNewUser(){
	String userName = JOptionPane.showInputDialog("User name: "); 
        String password = JOptionPane.showInputDialog("Password: ");
        
	users.add(userName);
	passwords.add(password);
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean validateInformation(String userName, String password){
        for(int i=0; i < users.size(); i++) {
            if(userName.equals(users.get(i)) && password.equals(passwords.get(i)))
                return true;
	}
	return false;
    }
    
    public void logOff(){
        String login, pass, opt;	
        boolean sucess;
        
	do{
            opt = JOptionPane.showInputDialog("\n 1 - Login as guest \n 2 - Login as user \n 0 - Turn off ");
            switch (opt){
                case "1":
                    sucess = true;
                    break;
                case "2":
                    login = JOptionPane.showInputDialog("User name: ");
                    pass = JOptionPane.showInputDialog("Password: ");

                    if(validateInformation(login, pass)){
                        print("Login sucessful");
                        sucess = true;
                        break;
                    }else{
                        print("Invalid user name or password.");
                        sucess = false;
                        break;
                    }
                case "0":
                    System.exit(0);
                default:
                    print("DIGITA UM NEGOÇO VÁLIDO, MEU CHAPA! LARRA");
                    sucess = false;
                    break;
            }
	}while (!sucess);
    }
    
    public void clearCache(){ print("Cache cleaned."); }

    @Override
    void displayComputerInfo() {
        print("\n             Welcome !           "+
                "\n\n Operational System: " + operationalSystem +
                "\n\n HD size: " + hdSize + "\n\n Current OS version: " + 
                currentOSVersion + "\n\n Remaining available storage: " + availableStorage);
    }
    
    public void criticalUpdate(){
        clearCache();
        updateOS();
    }
    
    private void print(String message){
        JOptionPane.showMessageDialog(null,message);
    }
}
