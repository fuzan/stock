package calculator.strategy;

import java.util.HashMap;
import java.util.Map;

import stock.Stock;

public interface PortfolioStrategy {
	
	Map<Stock, Strategy> stockStrategy = new HashMap<Stock,Strategy>();
	
	
}
