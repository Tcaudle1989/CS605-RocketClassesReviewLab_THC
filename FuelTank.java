
public class FuelTank {
	
	private int fuelWeight;
	
	public FuelTank(int fuelWeight) {
		this.fuelWeight = fuelWeight;
	}
	
	public int getFuelWeight() {
		return fuelWeight;
	}
	
	public void setFuelWeight(int fuelWeight) {
		this.fuelWeight = fuelWeight;
	}
	
	public String toString() {
		return "FuelTank: fuelWeight=" + fuelWeight;
	}
}
