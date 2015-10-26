package pack;

/**
 * 
 * @author cody schaffer
 * 
 * The purpose of this class is to show inheritence between electronic equipment. The heirarchy is this:
 * 
 * electronicEquipment -- computers------EVERYTHING ELSE 
 * xbox
 * pager---cellphone ---- iphone
 * digicam
 * ipod
 * 
 * There will be indicated inheritence in comments below.
 */


public class ElectronicsDriver {

public static void main(String[] args) {
		
		
		Computers comp = new Computers(30.5, 599.99, "Uses a VGA cable", "Microsoft", "Microsoft Computer", 1, 60, 2000, 300);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+comp.getName());//INHERITS FROM ELECTRONIC EQUIP
		System.out.println("cost of the system: "+comp.getCost());//INHERITS FROM ELECTRONIC EQUIP
		System.out.println("weight of the system: " +comp.getWeight());//INHERITS FROM ELECTRONIC EQUIP
		System.out.println("Power source: "+comp.getPower());//INHERITS FROM ELECTRONIC EQUIP
		System.out.println("Number of buttons: "+comp.getButtons());
		System.out.println("Data Storage in TerraBytes: "+comp.getData());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		comp.onOrOff();//INHERITS FROM ELECTRONIC EQUIP
		comp.processesData();
		comp.hasPrograms();
	
		XBox xb = new XBox(15.6, 200.00, "Uses a power cord", "Microsoft", "XBOX", 1, 900, 9000, 300, 2, 1);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+xb.getName());//INHERITS FROM COMPUTER
		System.out.println("cost of the system: "+xb.getCost());
		System.out.println("weight of the system: " +xb.getWeight());
		System.out.println("Power source: "+xb.getPower());
		System.out.println("Number of buttons: "+xb.getButtons());
		System.out.println("Data Storage in TerraBytes: "+xb.getData());//INHERITS FROM COMPUTER
		System.out.println("Number of consoles needed: "+xb.getConsole());
		System.out.println("Number of games in posseseion: "+xb.getGame());
		System.out.println("Number of controllers: "+ xb.getControl());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		xb.onOrOff();//INHERITS FROM ELECTRONIC EQUIP
		xb.processesData();//INHERITS FROM COMPUTER
		xb.hasPrograms();//INHERITS FROM COMPUTER
		xb.playGames();
		
		
		Pager pg = new Pager(2.3, 15.00, "Battery Charged", "Linux", "Super Pager", 1, 3, 500, 2, 2);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+pg.getName());//INHERITS FROM COMPUTER
		System.out.println("cost of the system: "+pg.getCost());
		System.out.println("weight of the system: " +pg.getWeight());
		System.out.println("Power source: "+pg.getPower());
		System.out.println("Number of buttons: "+pg.getButtons());
		System.out.println("Data Storage in TerraBytes: "+pg.getData());//INHERITS FROM COMPUTER
		System.out.println("How many Texts recieved: "+ pg.getText());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		pg.onOrOff();//INHERITS FROM COMPUTER
		pg.processesData();//INHERITS FROM COMPUTER
		pg.hasPrograms();//INHERITS FROM COMPUTER
		pg.beep();
		pg.seeMessage();
		
		CellPhone cp = new CellPhone(1, 500.00, "Battery Charged", "Nokia", "Nokia CSC300", 1, 30, 300, 2, 1, "Hello Ekatrina", 50);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+cp.getName());
		System.out.println("cost of the system: "+cp.getCost());
		System.out.println("weight of the system: " +cp.getWeight());
		System.out.println("Power source: "+cp.getPower());
		System.out.println("Number of buttons: "+cp.getButtons());
		System.out.println("Data Storage in TerraBytes: "+cp.getData());//INHERITS FROM PAGER
		System.out.println("How many Texts recieved: "+ cp.getText());//INHERITS FROM PAGER
		System.out.println("How many calls during the day: "+ cp.getCalls());
		System.out.println("A text message: "+cp.getTextString());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		cp.onOrOff();
		cp.processesData();
		cp.hasPrograms();
		cp.beep();//INHERITS FROM PAGER
		cp.seeMessage();//INHERITS FROM COMPUTER
		cp.call();
		cp.texts();
			
		DigiCamera dc = new DigiCamera(5.6, 300.99, "Battery Charged", "Canon", "Canon 300AB", 1, 30, 60000, 2, 1);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+dc.getName());//OBVIOUSLY INHERITS
		System.out.println("cost of the system: "+dc.getCost());
		System.out.println("weight of the system: " +dc.getWeight());
		System.out.println("Power source: "+dc.getPower());
		System.out.println("Number of buttons: "+dc.getButtons());
		System.out.println("Data Storage in TerraBytes: "+dc.getData());
		System.out.println("Number of pics: " +dc.getPics());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		dc.onOrOff();//OBVIOUSLY INHERITS
		dc.processesData();
		dc.hasPrograms();
		dc.focus();
		dc.picsToComputer();
		dc.takePic();
		
	
		
		IPod ip = new IPod(0.5, 39.99, "Battery charged", "Apple", "Ipod Nano", 1, 7, 40, 2, 1);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+ip.getName());//INHERITED
		System.out.println("cost of the system: "+ip.getCost());
		System.out.println("weight of the system: " +ip.getWeight());
		System.out.println("Power source: "+ip.getPower());
		System.out.println("Number of buttons: "+ip.getButtons());
		System.out.println("Data Storage in TerraBytes: "+ip.getData());
		System.out.println("Number of songs: "+ip.getSongs());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		ip.onOrOff();//INHERITED
		ip.processesData();
		ip.hasPrograms();
		ip.shuffle();
		ip.playSongs();
		
		IPhone iph = new IPhone(1, 299.99, "Battery Charged", "Apple", "iPhone 300c", 1, 3, 600, 3, 24, "Hello Ekatrina, please grade.", 666, "All", "Unlimited", 7);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("name of the system: "+iph.getName());//INHERITED FROM PHONE
		System.out.println("cost of the system: "+iph.getCost());
		System.out.println("weight of the system: " +iph.getWeight());
		System.out.println("Power source: "+iph.getPower());
		System.out.println("Number of buttons: "+iph.getButtons());
		System.out.println("Data Storage in TerraBytes: "+iph.getData());
		System.out.println("How many Texts recieved: "+ iph.getText());
		System.out.println("How many calls during the day: "+ iph.getCalls());
		System.out.println("A text message: "+iph.getTextString());
		System.out.println("Internet connection: "+iph.getInternet());
		System.out.println("Amount of things to multitask in: "+ iph.getMultitasking());
		System.out.println("DataPlan: "+iph.getDataPlan());
		//METHODS
		System.out.println("\n METHODS BEING RUN");
		System.out.println("--------------------------------------------------------------------------------------------");
		iph.onOrOff();//INHERITED FROM PHONE
		iph.processesData();
		iph.hasPrograms();
		iph.beep();
		iph.seeMessage();
		iph.call();
		iph.texts();
		iph.camera();
		iph.gamesIphone();
		iph.focusIphoneCam();
		iph.iPod();
		iph.takeIphoneCam();
		
		
		
		

	}

}
