package view;

import gainOrLossCalculator.SimpleCalculator;

import java.math.BigDecimal;

import stock.Stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s = new Stock();
		//Boston Scientific Corporation,S&P 500
		s.setStockCode("BSX");
		s.setBuyInDate("2009-08-31");
		s.setBuyInPrice(11.36);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-09-28");
		s.setBuyInPrice(10.01);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-10-5");
		s.setBuyInPrice(10.29);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-11-2");
		s.setBuyInPrice(8.08);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-12-7");
		s.setBuyInPrice(8.67);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-1-4");
		s.setBuyInPrice(9.00);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-2-1");
		s.setBuyInPrice(8.21);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-3-1");
		s.setBuyInPrice(7.89);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-04-05");
		s.setBuyInPrice(6.97);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-05-3");
		s.setBuyInPrice(6.38);
		s.setBuyInShare(100);

		
		s.setBuyInDate("2009-05-31");
		s.setBuyInPrice(5.75);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-06-7");
		s.setBuyInPrice(5.77);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-07-5");
		s.setBuyInPrice(6.46);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-08-2");
		s.setBuyInPrice(5.80);
		s.setBuyInShare(100);

		s.setBuyInDate("2009-9-28");
		s.setBuyInPrice(5.75);
		s.setBuyInShare(100);
		
		
		s.setSellOutDate("2009-10-30");
		s.setSellOutPrice(15.00);
		s.setSellOutShare(1000);
		

		SimpleCalculator sc = new SimpleCalculator();
		System.out.print("Gain : ");
		System.out.println(sc.gainOrLoss(s).gainValue);
		System.out.print("Gain percentage : ");
		
		BigDecimal b = new BigDecimal(sc.gainOrLoss(s).gainPercentage); 
		float f = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue(); 
		System.out.println(f);
	}

}
