package calculator.strategy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import entity.stock.Stock;

public interface PortfolioStrategy {
	
	Map<Stock, Strategy> stockStrategy = new HashMap<Stock,Strategy>();
	
	double buyInOrSellOut(Stock stock,Date actionTime);
	
}
