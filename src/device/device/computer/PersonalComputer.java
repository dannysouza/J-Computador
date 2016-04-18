package device.computer;

import java.util.ArrayList;

public class PersonalComputer extends Computer{
    private ArrayList<String> users;
    private ArrayList<String> passwords;
    private String name;

    public PersonalComputer() {
        super("Windows 10", 1000, 1.1);
        
    }
    
    public void logOff(){
        int opt;
        string name, pass;
		
	    do{
    	cout << "\n 1 - Login as guest \n 2 - Login as user \n 0 - Turn off ";
    	cin >> opt;
    	switch (opt){
    		case 1:
    			break;
    		case 2:
    			
    			cout << "\n User name: ";
    			cin >> name;
    			cout << "\n Password: ";
    			cin >> pass;
    			
    			if(logIn(name, pass));
    			{
    				cout << "\n Login sucessful \n";
					break;
				}
				
				cout << "\n Invalid user name or password. \n";
    			
    		default:
    			cout << "\n Choose an option ";
    		}
    		break;	
		}while (opt != 0);
}
}
