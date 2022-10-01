package j06_클래스;

public class Product {

	String category;
	String productName;
	int price;
	
	Product() {
		System.out.println("상품을 생성합니다.");
	}
	
	Product(String category, String productName, int price) {
		this.category = category;
		this.productName = productName;
		this.price = price;
	}
	
	void showProductInfo() {
		System.out.println("category: " + category);
		System.out.println("productName: " + productName);
		System.out.println("price: " + price);
		System.out.println();
	}
	
}
