import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    Scanner sc = new Scanner(System.in);
    ArrayList<Stock> stockList = new ArrayList<>();

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.stocksValue();
    }

    public void stocksValue() {
        Stock stock = new Stock();

        System.out.println("Enter the stock name");
        String stockName = sc.nextLine();
        stock.setStockName(stockName);

        System.out.println("enter the price of share ");
        int sharePrice = sc.nextInt();
        stock.setSharePrice(sharePrice);

        System.out.println("Enter the number of shares");
        int numOfShares = sc.nextInt();
        stock.setNumOfShares(numOfShares);

        stockList.add(stock);

        for (int i = 0; i < stockList.size(); i++) {
            stock.setStockValue(stock.getNumOfShares() * stock.getSharePrice());
            System.out.println("Name of Stock : " + stock.getStockName());
            System.out.println("Number of Shares : " + stock.getNumOfShares());
            System.out.println("Stock Share price : " + stock.getSharePrice());
            System.out.println("Stock value : Rs." + stock.getStockValue());
        }
    }
}