package buy_and_sell;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
