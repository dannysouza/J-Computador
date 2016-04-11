package device;

public abstract class Computer extends Device{
    protected
     	String operationalSystem;
     	float hdSize;
     	float availableStorage;
     	double currentOSVersion;
     	static double latestOSVersion = 1.1;
     	Date downloadDate;
     	Network network;
	
	Computer(String OS, float hd, float currentV)
	{
		this.operationalSystem = OS;
		this.hdSize = hd;
		this.currentOSVersion = currentV;
		this.availableStorage = hd;
		network = new Network();
	}

	Computer (Computer other)
	{
		this.operationalSystem=other.operationalSystem;
		this.hdSize=other.hdSize;
		this.currentOSVersion=other.currentOSVersion;
	}

	public void updatedOS()
	{
		System.out.println( "\n Current version: " + currentOSVersion);
		System.out.println( "\n Latest version available: " + latestOSVersion);
		System.out.println( "\n\n	Downloading files... ");
		
		downloadDate.currentDateTime();
		
		System.out.println( "\n\n Download date: ");
		downloadDate.displayDate();
		
		currentOSVersion = latestOSVersion;
		
		System.out.println( "\n Operational System " + operationalSystem + " has been updated to version " + latestOSVersion);
		
		launchOSVersion();
	}

	public void launchOSVersion()
	{
		latestOSVersion += 0.1;
	}

	public void installNetworkDrivers()
	{
		network.installDrivers();
	}

	public void connectToInternet()
	{
		network.connectToInternet();
	}

	public void removeMalwares()
	{
	    network.removeMalwares();
	}
}
