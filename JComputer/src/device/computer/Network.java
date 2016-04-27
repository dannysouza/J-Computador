package device.computer;

import java.util.Random;
import javax.swing.JOptionPane;

public class Network {

	public Network() {
		driversInstalled = false;
		malware = false;
	}

	public void installDrivers() {
		if (driversInstalled)
			print("Network drivers are already installed.");
		else
			driversInstalled = true;
	}

	public void connectToInternet() {
		if (driversInstalled) {
			print("Connected.");
			if (new Random().nextBoolean()) {
				JOptionPane.showMessageDialog(null, "Your computer has been infected.");
				malware = true;
			}
		} else
			print("Network drivers not installed.");
	}

	public void removeMalwares() {
		if (malware) {
			malware = false;
			print("Malwares successfully removed.");
		} else
			print("Your computer is not infected.");
	}

	private void print(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	private boolean driversInstalled, malware;
}
