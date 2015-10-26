package pack;

public class Startup {

	public static void main(String[] args) {
		
		PoliceOfficer po = new PoliceOfficer("Eric", "Gold", 29, 66666, 77777, 666119);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("THE POLICE OFFICER");
		System.out.println("Officer's name: " + po.firstName + " " + po.lastName);
		System.out.println("Officers age: " + po.age +  ", and badge number: " + po.badgeNum );
		System.out.println("Officer's patrol number: "+ po.getPatrolNum() + ", officers weapon serial number: " + po.getWeaponSerial());
		po.pullCrimminalOver();
		po.writeTicket("alffafaf", "Convict Man");
		po.drawWeapon();
		po.shootWeapon();
		po.locatePerson("downtown Portland");
		
		
		Fireman fm = new Fireman("Collin", "Grey", 34, 555555, 500.88, 450.3, 60);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("THE FIREMAN");
		System.out.println("fireman's name: " + fm.firstName + " " + fm.lastName);
		System.out.println("fireman's age: " + fm.age +  ", and badge number: " + fm.badgeNum );
		System.out.println("the fireman's maximum lifting weight: " + fm.getWeight() + ", and his fastest maximum running distance in miles: " + fm.getRun());
		System.out.println("the fireman's serial number for his gear: " + fm.getGear());
		fm.locatePerson(" North Main Street");
		fm.putOnGear();
		fm.putOutFire("12635 Se Lani Ln Boring Oregon", 10);
		fm.rescuePerson("at the top of the stairs on the fourth floor of the Main Street Building.");
		fm.revivePerson("CPR");

	}

}
