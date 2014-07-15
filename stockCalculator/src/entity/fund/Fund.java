package entity.fund;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Fund {
	private String fundName;
	private boolean fixRateFund;
	private int fixedDuration;
	
	/**
	 * ratio
	 */
	private double fixedGain;
	
	private double buyInInvest;
	
	private Date buyInDate;
	private Date sellOutDate;
	
	/**
	 * balance
	 */
	private double balance;
	
	/**
	 *  key : year
	 *  value : gain rate
	 */
	private Map<Date,Double> flexibleGainRate = new HashMap<Date,Double>(); 
	
	
	/**
	 * key : year
	 * value : invest money
	 */
	private Map<Date,Double> flexibleInvestment = new HashMap<Date,Double>(); 
	
	
	private double totalInvested;
	
	
	public double getTotalInvested() {
		return totalInvested;
	}

	public void setTotalInvested(double totalInvested) {
		this.totalInvested = totalInvested;
	}
	
	public double getBuyInInvest() {
		return buyInInvest;
	}
	public void setBuyInInvest(double buyInInvest) {
		this.buyInInvest = buyInInvest;
	}
	public boolean isFixRate() {
		return fixRateFund;
	}
	public void setFixRate(boolean fixRate) {
		this.fixRateFund = fixRate;
	}
	public Date getBuyInDate() {
		return buyInDate;
	}
	public void setBuyInDate(Date buyInDate) {
		this.buyInDate = buyInDate;
	}
	public Date getSellOutDate() {
		return sellOutDate;
	}
	public void setSellOutDate(Date sellOutDate) {
		this.sellOutDate = sellOutDate;
	}
	public Map<Date, Double> getFlexibleGainRate() {
		return flexibleGainRate;
	}
	public void setFlexibleGainRate(Map<Date, Double> flexibleGainRate) {
		this.flexibleGainRate = flexibleGainRate;
	}
	public Map<Date, Double> getFlexibleInvestment() {
		return flexibleInvestment;
	}
	public void setFlexibleInvestment(Map<Date, Double> flexibleInvestment) {
		this.flexibleInvestment = flexibleInvestment;
	}
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public int getFixedDuration() {
		return fixedDuration;
	}
	public void setFixedDuration(int fixedDuration) {
		this.fixedDuration = fixedDuration;
	}
	public double getFixedGain() {
		return fixedGain;
	}
	public void setFixedGain(double fixedGain) {
		this.fixedGain = fixedGain;
	}
	
	
}
