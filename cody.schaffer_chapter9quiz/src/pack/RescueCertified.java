package pack;

public interface RescueCertified extends ILocator {

	@Override
	public void locatePerson(String location); 

	void rescuePerson(String location);
	void revivePerson(String revivalType);


}
