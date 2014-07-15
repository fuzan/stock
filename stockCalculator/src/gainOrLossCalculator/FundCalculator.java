package gainOrLossCalculator;

import java.math.BigDecimal;

import calculator.strategy.FundStrategy;
import entity.fund.FixRateFund;

public class FundCalculator {
	public GainOrLoss gainOrLoss(FixRateFund fund, FundStrategy fs){
		GainOrLoss gl = new GainOrLoss();
		
		if( fund.isFixRate() ){
			int years = fund.getFixedDuration();
			double balance = fund.getBuyInInvest();
			
			double durationInvestment = fund.getDurationInvestment();
			double fixRate = fund.getFixedGain();
			double originalMoney = fund.getTotalInvested();
			/**
			 * start from 1, because 0 is the buyIn.
			 */
			originalMoney = balance;
			balance = balance * ( 1+fixRate );
			for(int i=1;i<years;i++){
				originalMoney += durationInvestment;
				balance = (balance+durationInvestment)*(fixRate+1);
			}
			
			
			double tempGain = balance;
		    BigDecimal g = new BigDecimal(tempGain); 
			double _balance = g.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		    gl.gainValue = _balance;
		    
		    
		    double tempPercentage = (balance - originalMoney)/balance;
		    BigDecimal b = new BigDecimal(tempPercentage); 
			double f = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		    gl.gainPercentage = f;
		}
		
		
		return gl;
	}
}
