package davenkin;

public interface OrderService {

	/**
	 * 同时调用 JMS 和 Database 存储 order 
	 * 
	 * @param order
	 */
    public void makeOrder(Order order);
}
