public class Main {
    public static void main(String[] args) {
        //Publisher
        StockExchangeMarket stockExchangeMarket = new StockExchangeMarket();
        //Subscriber
        Subscriber subscriber1 = new Subscriber() {

            @Override
            public void showNotifications(String text) {
                // TODO Auto-generated method stub
                System.out.println("Citadel: " + text);
            }
        };
        Subscriber subscriber2 = new Subscriber() {
            @Override
            public void showNotifications(String text) {
                System.out.println("Tower Research: " + text);
            }
        };

        stockExchangeMarket.addSubscriber(subscriber1);
        stockExchangeMarket.addSubscriber(subscriber2);

        stockExchangeMarket.addSubscriber(subscriber1);
        stockExchangeMarket.addSubscriber(subscriber2);


        stockExchangeMarket.setMarketState("Market is up");


        stockExchangeMarket.removeSubscriber(subscriber1);
        stockExchangeMarket.setMarketState("Market is down");
    }
    }

