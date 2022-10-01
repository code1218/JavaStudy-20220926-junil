package j06_클래스;

public class ProductMain {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.category = "텀블러";
		product1.productName = "블루 텀블러";
		product1.price = 15000;
		
		product1.showProductInfo();
		
		Product product2 = new Product();
		product2.category = "머그컵";
		product2.productName = "화이트 머그컵";
		product2.price = 20000;
		
		product2.showProductInfo();
		
		Product product3 = new Product("커피", "아이스 아메리카노", 4500);
		product3.showProductInfo();

	}

}









