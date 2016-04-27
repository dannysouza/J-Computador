package jcomputer;

import device.computer.Computer;
import device.computer.PersonalComputer;
import device.computer.WorkComputer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JComputer {

	public static void main(String[] args) {
		String opt;

		opt = JOptionPane.showInputDialog("Choose a device: \n1 - Computer ");

		switch (opt) {
		case "1":
			deviceComputer();
			break;
		default:
			print("\n Please enter a valid option. \n");
		}
	}
	
	public static void deviceComputer() {
		String opt;

		ArrayList<Computer> pcs = new ArrayList<>();
		boolean add;

		do {
			print(" Add a new computer to the Workstation ");

			opt = JOptionPane.showInputDialog(
					" Select the type of computer you want to add: \n 1 - Work Computer \n 2 - Personal Computer \n 0 - Exit \n ");
			
			if (opt == null)
				System.exit(0);
			
			int op;
			
			try {
				op = Integer.parseInt(opt);
				add = true;
			} catch (NumberFormatException e) {
				add = false;
			}
			
			if(add){
				if (op == 1))
					pcs.add(new WorkComputer());
				else if (op == 2)
					pcs.add(new PersonalComputer());
				else if (op == 0)
					System.exit(0);
				else{
					JOptionPane.showMessageDialog(null, "Choose a valid option");
					add = false;
				}
					
				if(add){
					int op = JOptionPane.showConfirmDialog(null, "Do you wish to add more computers?");
					
					if (op == JOptionPane.YES_OPTION)
						add = true;
					else
						add = false;
				}
			}

			
		} while (add);
	}

	private static void workStation(Computer c) {

		if (c instanceof WorkComputer) {
			WorkComputer aux = (WorkComputer) c;
			aux.criticalUpdate();
			optionWorkC(aux);
		}
	}

	private static void optionWorkC(WorkComputer w) {
		String opt;
		WorkComputer.launchOSVersion();
		boolean sucess;

		do {
			opt = JOptionPane.showInputDialog("\n1 - Execute Calculator \n2 - Execute Text Editor "
					+ "\n3 - Update Windows \n 4 - Connect to the internet \n 5 - Search users 0 - Turn Off");
			switch (opt) {
			case "1":
				w.exeCalculator();
				sucess = true;
				break;
			case "2":
				w.exeEditor();
				sucess = true;
				break;
			case "3":
				w.updateOS();
				sucess = true;
				break;
			case "4":
				w.connectToInternet();
				sucess = true;
				break;
			case "5":
				w.searchUsers();
				sucess = true;
				break;
			default:
				sucess = false;
				print("Choose a valid option");
				break;
			}
		} while (!sucess);
	}

	private static void optionPersonalC(PersonalComputer pc) {
		String opt, name, pass;
		pc.logOff();

		PersonalComputer.launchOSVersion();

		boolean sucess;

		do {
			opt = JOptionPane.showInputDialog("1 - Execute Game \n2 - Create new user account \n3 - Log Off \n"
					+ "4 - Update Windows \n5 - Connect to the internet \n6 - "
					+ "Install Network drivers \n 7 - Show users 0 - Turn Off \n");
			switch (opt) {
			case "1":
				pc.exeGame();
				sucess = true;
				break;
			case "2":
				pc.createNewUser();
				sucess = true;
				break;
			case "3":
				pc.logOff();
				sucess = true;
				break;
			case "4":
				pc.updateOS();
				sucess = true;
				break;
			case "5":
				pc.connectToInternet();
				sucess = true;
				break;
			case "6":
				pc.installNetworkDrivers();
				sucess = true;
				break;
			case "7":
				pc.checkDatabase();
				sucess = true;
				break;
			default:
				sucess = false;
				print("Choose a valid option");
				break;
			}
		} while (!sucess);

	}

	private static void print(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
