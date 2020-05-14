
public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	
	public static void main(String args[])
	{
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.GoGreen();
		ContinentalTraffic b = new AustralianTraffic();
		b.goOnTrain();
	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		
		System.out.println("Green Go Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		
		System.out.println("Flash yellow Implementation");
	}

	@Override
	public void goOnTrain() {
		// TODO Auto-generated method stub
		System.out.println("Going By Train");
	}
}
