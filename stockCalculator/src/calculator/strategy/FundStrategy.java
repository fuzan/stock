package calculator.strategy;

import java.util.Date;

import entity.stock.Stock;

public interface FundStrategy {
	
	double buyInOrSellOut(Stock stock,Date actionTime);
	
}
