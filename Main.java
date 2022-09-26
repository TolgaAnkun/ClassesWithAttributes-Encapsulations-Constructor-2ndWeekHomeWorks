
public class Main {

	public static void main(String[] args) {
		
		Products products = new Products (1,"Casper","Bilgisayar",6500, 100) ;
		
		Products products2 = new Products () ;
		
		products2.setName("Lenova ");
		products2.setId(2);
		products2.setDescription("Bilgisayar");
		products2.setStockAmount(100);
		products2.setPrice(7500);
		
		
		ProductsManager productsManager = new ProductsManager () ;
		
		productsManager.Add(products);
		System.out.println(products.getKod());
		
		productsManager.Add(products2);
		System.out.println(products2.getKod());
		
		
		
		

	}

}
