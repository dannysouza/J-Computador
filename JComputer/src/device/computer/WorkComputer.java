package device.computer;

import javax.swing.JOptionPane;

public class WorkComputer extends Computer {
	private String privacyPolicy;
	private String name;

	public WorkComputer() {
		super("Windows 7", 500, 1.0);
		this.privacyPolicy = "Please don't hack anything thanks";
		installNetworkDrivers();
		displayComputerInfo();
	}

	public WorkComputer(final WorkComputer w1) {
		super(w1.operationalSystem, w1.hdSize, w1.currentOSVersion);
		this.privacyPolicy = w1.privacyPolicy;
		installNetworkDrivers();
		displayComputerInfo();
	}

	public void exeCalculator() {
		Calculator calculadora = new Calculator();
		calculadora.setVisible(true);
	}

	private void print(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public void exeEditor() {
		Editor editor = new Editor();
		editor.setVisible(true);
	}

	public void criticalUpdate() {
		installNetworkDrivers();
		updateOS();
		removeMalwares();
	}

	@Override
	void displayComputerInfo() {
		print("\n             Welcome to Suicide Squad Workstation           " + "\n\n Operational System: "
				+ operationalSystem + "\n\n HD size: " + hdSize + "\n\n Current OS version: " + currentOSVersion
				+ "\n\n Remaining available storage: " + availableStorage);
	}

	public void searchUsers() {
		String name;
		name = JOptionPane.showInputDialog("User to search:");

		checkDatabase(name);

		if (checkDatabase(name))
			print("This username already exist");
		else
			print("This username is available");
	}

	@Override
    public boolean checkDatabase(String name){
    	for(int i=0; i < users.size(); i++){
    		if(userName.equals(users.get(i));
    			return true;
    	}
    	return false;
    }
}
