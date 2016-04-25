package device.computer;

import computercerto.Date;
import javax.swing.JOptionPane;

public abstract class Computer extends Device {

    protected String operationalSystem;
    protected double hdSize, availableStorage, currentOSVersion;
    protected static double latestOSVersion = 1.1;
    protected Date downloadDate;
    protected Network network;

    public Computer(String OS, double hd, double currentV) {
        this.operationalSystem = OS;
        this.hdSize = hd;
        this.currentOSVersion = currentV;
        this.availableStorage = hd;
        network = new Network();
    }

    Computer(final Computer other) {
        this.operationalSystem = other.operationalSystem;
        this.hdSize = other.hdSize;
        this.currentOSVersion = other.currentOSVersion;
    }

    public void updateOS() {
        print("Current version: " + currentOSVersion);
        print("Latest version available: " + latestOSVersion);
        print("Downloading files... ");

        downloadDate.currentDateTime();

        print("Download date: ");
        downloadDate.displayDate();

        currentOSVersion = latestOSVersion;

        print("Operational System " + operationalSystem + " has been updated to version " + latestOSVersion);

        launchOSVersion();
    }

    private void print(String message){
        JOptionPane.showMessageDialog(null,message);
    }
    
    public void launchOSVersion() {
        Computer.latestOSVersion += 0.1;
    }

    public void installNetworkDrivers() {
        network.installDrivers();
    }

    public void connectToInternet() {
        network.connectToInternet();
    }

    public void removeMalwares() {
        network.removeMalwares();
    }
}
