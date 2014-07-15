package gainOrLossCalculator;

import java.math.BigDecimal;

import entity.stock.Stock;

public class SimpleCalculator {
	
	public GainOrLoss gainOrLoss(Stock stock){
		
		GainOrLoss gain = new GainOrLoss();
		
		double buy = stock.getInvestMoney();
		double sell = stock.getSellOutPrice();
		int sellOutShare = stock.getSellOutShare();
		
		gain.gainValue = sell*sellOutShare - buy;
		double tempPercentage = 0.0;
		
		if( gain.gainValue  > 0 ){
			gain.gain = true;
			tempPercentage = (gain.gainValue)/buy;
		}else{
			tempPercentage = (Math.abs(gain.gainValue))/buy;
		}
		
		BigDecimal b = new BigDecimal(tempPercentage); 
		double f = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		gain.gainPercentage = f;
		
		return gain;
	}
	
	public static void main(String[] args) {
		
	}
}
