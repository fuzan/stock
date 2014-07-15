package view;

import java.util.Date;

import entity.fund.FixRateFund;
import gainOrLossCalculator.FundCalculator;
import gainOrLossCalculator.GainOrLoss;

public class FundMain {
	public static void main(String[] args) {
		FixRateFund fr = new FixRateFund();
		fr.setFixRate(true);
		fr.setFundName("Zhen");
		fr.setBuyInDate(new Date());
		fr.setBuyInInvest(6000.0);
		fr.setDurationInvestment(6000);
		fr.setFixedGain(0.03);
		fr.setFixedDuration(12);
		
		FundCalculator fc = new FundCalculator();
		
		GainOrLoss gl = fc.gainOrLoss(fr, null);
		System.out.print("Gain : ");
		System.out.println(gl.gainValue);
		System.out.print("Gain percentage : ");
		System.out.println(gl.gainPercentage);
	}
}
