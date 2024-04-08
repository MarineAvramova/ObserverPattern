import java.util.ArrayList;
import java.util.List;

public class StockExchangeMarket implements Publisher{
    private List<Subscriber> subscribers = new ArrayList<>();
    private String marketState;

    public void setMarketState(String state) {
        this.marketState = state;
        notifySubscribers(marketState);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);

    }

    @Override
    public void notifySubscribers(String text) {
        subscribers.forEach(subscriber -> subscriber.showNotifications(text));

    }
}
