
public class Rocket {
	private Engine eng;
	private FuelTank fTank;
	private String[][] crew;
	
	public Rocket(int fuelWeight, int fuelUsePSec, String captainName, 
			String navigatorName, String engineerName) {
		fTank = new FuelTank(fuelWeight);
		eng = new Engine(fuelUsePSec);
		crew = new String[3][2];
		
		crew[0][0] = captainName;
		crew[0][1] = "Captain";
		crew[1][0] = navigatorName;
		crew[1][1] = "Navigator";
		crew[2][0] = engineerName;
		crew[2][1] = "Engineer";
	}
	
	public int launch() {
		if (fTank.getFuelWeight() > eng.getFuelUsePSec()) {
			eng.setEngineRunning(true);
			return fTank.getFuelWeight() / eng.getFuelUsePSec();
		}
		return -1;
	}
	
	public Engine getEng() {
		return eng;
	}
	
	public FuelTank getfTank() {
		return fTank;
	}
	
	public String[][] getCrew() {
		return crew;
	}
	
	public String toString() {
		String result = "Crew\n";
		for (int i = 0; i < crew.length; i++) {
			result += crew[i][0] + ", ";
			result += crew[i][1];
			result += "\n";
		}
		result += "Rocket State\n";
		result += eng.toString() + "\n";
		result += fTank.toString();
		return result;
	}
}
