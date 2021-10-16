package stockaccount;

public class Main {
	public static double totalStock = 0;

	public static void main(String[] args) {
		StockAccount();
	}

	public static void StockAccount() {
		
		UserInterface user = new UserInterface();
		StockStore stockStore = new StockStore();
		
		while (true) {
			System.out.println("enter 1.Add Stock Account 2.view report");
			int choice;
			choice = InputScanner.inputInteger();
			switch (choice) {
			case 1:
				StockCatagories stock = new StockCatagories();
				user.addStock(stock);
				totalStock += stock.getTotalValueOfStock();
				stockStore.add(stock);
				break;
			case 2:
				System.out.println("StockStore:");
				user.print(stockStore.getStockList());
				System.out.println("value of total stocks is:" + totalStock + " Rs.");
			}
		}
	}
}
