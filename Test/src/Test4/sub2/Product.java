package Test4.sub2;

public class Product {
	
	private String productId;
	private String productName;
	privat int price;
	privat int quantity;
	
	public void product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity
	}
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정됨");
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드" + quantity + "개 재고 추가됨");
	}

}
