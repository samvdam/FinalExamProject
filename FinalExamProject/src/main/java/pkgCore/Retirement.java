package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int yw, double rw, int yr, double rr, double ri, double ss) {
		this.iYearsToWork=yw;
		this.dAnnualReturnWorking=rw;
		this.iYearsRetired=yr;
		this.dAnnualReturnRetired=rr;
		this.dRequiredIncome=ri;
		this.dMonthlySSI=ss;
	}
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}

	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		double tot=-this.dAnnualReturnWorking/12*this.TotalAmountSaved()/(1-Math.pow((1+this.dAnnualReturnWorking/12),this.iYearsToWork*12));
		
		return tot;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		double amt=this.dRequiredIncome-this.dMonthlySSI;
		
		double tot=amt*(Math.pow((1+this.dAnnualReturnRetired/12),this.iYearsRetired*12)-1)/(this.dAnnualReturnRetired/12)/Math.pow((1+this.dAnnualReturnRetired/12),this.iYearsRetired*12);
		
		return tot;
	}
}