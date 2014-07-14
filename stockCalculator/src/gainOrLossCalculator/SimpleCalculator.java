package gainOrLossCalculator;

import stock.Stock;

public class SimpleCalculator {
	
	public GainOrLoss gainOrLoss(Stock stock){
		
		GainOrLoss gain = new GainOrLoss();
		
		double buy = stock.getInvestMoney();
		double sell = stock.getSellOutPrice();
		int sellOutShare = stock.getSellOutShare();
		
		gain.gainValue = sell*sellOutShare - buy;
		
		if( gain.gainValue  > 0 ){
			gain.gain = true;
			gain.gainPercentage = (gain.gainValue)/buy;
		}else{
			gain.gainPercentage = (Math.abs(gain.gainValue))/buy;
		}
		return gain;
	}
	
	public static void main(String[] args) {
		
	}
}
