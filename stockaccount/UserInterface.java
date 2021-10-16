package stockaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public void print(ArrayList<StockCatagories> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println("stockList" + stockList.get(i));
		}

	}

	public void addStock(StockCatagories stock) {
		Instruction instruction = new Instruction();
		instruction.enterNameOfShare();
		stock.setNameOfShare(InputScanner.inputString());
		instruction.enterNumberOfShares();
		stock.setNumberOfShares(InputScanner.inputDouble());
		instruction.enterSharePrice();
		stock.setSharePrice(InputScanner.inputDouble());
		stock.setTotalValueOfStock(stock.getNumberOfShares() * stock.getSharePrice());
		StockStore stockStore = new StockStore();
		stockStore.add(stock);
	}
}
