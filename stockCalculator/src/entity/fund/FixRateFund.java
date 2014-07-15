package entity.fund;


/**
 * This fund is gain guaranteed fund.
 * @author fuzan
 *
 */
public class FixRateFund extends Fund {
    
	
	private double durationInvestment;

	public double getDurationInvestment() {
		return durationInvestment;
	}

	public void setDurationInvestment(double durationInvestment) {
		this.durationInvestment = durationInvestment;
	}
   
	
}
