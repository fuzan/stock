package calculator.strategy;

import java.util.Date;

import stock.Stock;

/**
 *  One strategy can be used by many portfolios.
 * @author fuzan
 *
 */
public interface Strategy {

	public void setBuyInTime(Stock stock, Date BuyInTime);
	
	public void setAlarmStopBuyIn(Stock stock, Double price);
	
	public void setAlarmBeginSellOut(Stock stock, Double price);
	
	/**
	 * simple stategy:
	 *     buy each month 1st day.
	 *     sold out when reach the expected gain.
	 *     
	 *     
	 */
	public void setStrategy(Stock stock);
}
