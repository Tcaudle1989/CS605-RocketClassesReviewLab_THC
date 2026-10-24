public class Engine {
	
	private int fuelUsePsec;
	private boolean engRunning;
	
	public Engine(int fuelUsePSec) {
		fuelUsePsec = fuelUsePSec;
		engRunning = false;
	}
	
	public int getFuelUsePSec() {
		return fuelUsePsec;
	}
	
	public void setFuelUsePSec(int fuelUsePSec) {
		this.fuelUsePsec = fuelUsePSec;
	}
	
	public boolean getEngineRunning() {
		return engRunning;
	}
	
	public void setEngineRunning(boolean engineRunning) {
		engRunning = engineRunning;
	}
	
	public String toString() {
		return "Engine: engineRunning=" + engRunning + ", fuelUsePSec=" + fuelUsePsec;
	}
	
	
}
