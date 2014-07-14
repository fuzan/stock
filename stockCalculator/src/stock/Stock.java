package stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import stock.Operation;

/**
 * Base class for all stock
 * @author fuzan
 *
 */
public class Stock {
	
	boolean ongoing;
	
	List<Stock> historyOperation = new LinkedList<Stock>();
	
	private String stockCode;
	private double buyInPrice;
	private Date buyInDate;
	private int buyInShare;
	
	private Date sellOutDate;
	private double sellOutPrice;
	private int sellOutShare;
	
	private double investMoney;
	
	private List<StockHistory> historys = new LinkedList<StockHistory>();

	public List<StockHistory> getHistorys() {
		return historys;
	}


	public void setHistorys(List<StockHistory> historys) {
		this.historys = historys;
	}


	public int getBuyInShare() {
		return buyInShare;
	}
	
	
	public void setBuyInShare(int buyInShare) {
		
		StockHistory h = new StockHistory();
		h.operationType = Operation.BUY;
		h.operationDate = buyInDate;
		h.share = buyInShare;
		h.price = buyInPrice;
		historys.add(h);
		
		investMoney += buyInShare * buyInPrice;
		
		this.buyInShare += buyInShare;
	}
	
	
	public int getSellOutShare() {
		return sellOutShare;
	}
	
	
	public void setSellOutShare(int sellOutShare) {
		
		if( sellOutShare > buyInShare )
			return ;
		
		this.sellOutShare = sellOutShare;
		
		StockHistory h = new StockHistory();
		h.operationType = Operation.SELL;
		h.operationDate = sellOutDate;
		h.share = sellOutShare;
		h.price = sellOutPrice;
		historys.add(h);
		
		this.buyInShare -= sellOutShare;
	}
	
	
	public double getInvestMoney() {
		return investMoney;
	}


	public void setInvestMoney(double investMoney) {
		this.investMoney = investMoney;
	}


	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public double getBuyInPrice() {
		return buyInPrice;
	}
	public void setBuyInPrice(double buyInPrice) {
		this.buyInPrice = buyInPrice;
	}
	public Date getBuyInDate() {
		return buyInDate;
	}
	
	
	public void setBuyInDate(String buyInDate) {
		
		Date buyIn = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		try {
			buyIn = ft.parse(buyInDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.buyInDate = buyIn;
	}
	
	public Date getSellOutDate() {
		return sellOutDate;
	}
	
	
	public void setSellOutDate(String sellOutDate) {
		Date sellOut = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		try {
			sellOut = ft.parse(sellOutDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.sellOutDate = sellOut;
	}
	
	
	public double getSellOutPrice() {
		return sellOutPrice;
	}
	public void setSellOutPrice(double sellOutPrice) {
		this.sellOutPrice = sellOutPrice;
	}
	
	
}
