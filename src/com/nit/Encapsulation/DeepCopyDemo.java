package com.nit.Encapsulation;


 class Products
{
	private int productId;
	private String productName;
	
	public Products()
	{
		productId = 0;
		productName = null;
	}

	public Products(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}

public class DeepCopyDemo 
{
	public static void main(String[] args) 
	{
		Products p1 = new Products(111, "Laptop");
		
		Products p2 = new Products();
		p2.setProductId(p1.getProductId());
		p2.setProductName(p1.getProductName());
		
		System.out.println("Before Modification...");
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("After Modification...");
		p1.setProductId(222);
		p1.setProductName("Camera");
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
/* Before Modification...
Product [productId=111, productName=Laptop]
Product [productId=111, productName=Laptop]
After Modification...
Product [productId=222, productName=Camera]
Product [productId=111, productName=Laptop]
 */