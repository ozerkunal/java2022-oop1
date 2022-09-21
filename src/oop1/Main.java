package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		//set
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemnde.jpg");
			
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(5);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(5);
		product2.setImageUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("bilmemnde3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05551212121");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Özer");
		individualCustomer.setLastName("Ünal");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05321212121");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("EBD Enerji");
		corporateCustomer.setTaxNumber("123456789");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
