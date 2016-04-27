package device.computer;

import javax.swing.JOptionPane;

public abstract class Device {

	boolean turnedOn;
	float storageCapacity;

	public Device() {
		turnedOn = false;
	}

	public Device(boolean state, float storage) {
		turnedOn = state;

		if (storage > 0) {
			this.storageCapacity = storage;
		} else {
			this.storageCapacity = 1;
		}
	}

	public void turnOn() {
		if (turnedOn) {
			print("\n The device is already turned On. \n");
		} else {
			turnedOn = true;
			print("\n Device has been turned on. \n");
		}
	}

	public void turnOff() {
		if (!turnedOn) {
			print("\n The device is already turned off. \n");
		} else {
			turnedOn = false;
			print("\n Device has been turned off. Bye bye <3 \n");
		}
	}

	abstract void displayComputerInfo();

	private void print(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
