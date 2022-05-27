package buy_and_sell;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("구매주문");
		}
}
