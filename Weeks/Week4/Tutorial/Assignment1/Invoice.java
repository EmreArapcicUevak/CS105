public class Invoice {
	private String partNumber, description;
	private int quantity, pricePerItem;

	public Invoice(){this("No Name", "", 0,0);}
	public Invoice(String partNumber, String description, int quantity, int pricePerItem){
			setPartNumber(partNumber);
			setDescription(description);
			setQuantity(quantity);
			setPricePerItem(pricePerItem);
	}

	public Invoice(Invoice obj){
		this();
		if (obj != null){
			setPartNumber(obj.partNumber);
			setDescription(obj.description);
			setQuantity(obj.quantity);
			setPricePerItem(obj.pricePerItem);
		}
	}

	public void setPartNumber(String partNumber){
		if (partNumber == null)
			this.partNumber = "";
		else
			this.partNumber = partNumber;
	}

	public void setDescription(String description){
		if (description == null)
			this.description = "";
		else
			this.description = description;
	}

	public void setQuantity(int quantity){
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}

	public void setPricePerItem(int pricePerItem){
		if (pricePerItem < 0)
			this.pricePerItem = 0;
		else
			this.pricePerItem = pricePerItem;
	}

	public String getPartNumber(){return this.partNumber;}
	public String getDescription() {return this.description;}
	public int getQuantity(){return this.quantity;}
	public int getPricePerItem(){return this.pricePerItem;}
	
	public double getInvoiceAmount(){return (double) this.pricePerItem * this.quantity;}

	public String toString(){
		return String.format("Part Number: %s\nDescription: %s\nQuantity: %d\nPrice Per Item: %d",this.partNumber,this.description
		, this.quantity, this.pricePerItem);
	}

	public boolean equals(Invoice obj){
		if (obj == null)
			return false;
		else
			return obj.partNumber.equals(this.partNumber) && obj.description.equals(this.description) && 
			obj.quantity == this.quantity && obj.pricePerItem == this.pricePerItem;
	}
}; 
