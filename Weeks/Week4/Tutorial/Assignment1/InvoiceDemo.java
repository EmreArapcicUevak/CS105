public class InvoiceDemo{
	public static void main(String[] args){
		Invoice invoice1 = new Invoice(null);

		System.out.println(invoice1);

		invoice1.setQuantity(5);
		invoice1.setPricePerItem(100);
		invoice1.setPartNumber("32F00x");
		invoice1.setDescription("Mouse Control Unit");

		System.out.println(invoice1);

		Invoice invoice2 = new Invoice(invoice1);

		System.out.println(invoice2);
	}
};
