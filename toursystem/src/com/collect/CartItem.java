package com.collect;

import com.skishop.entity.Product;

public class CartItem {
	
	private Product product;
	private int count;
	private int price;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		
		this.count = count;
		this.price=this.product.getDiscountprice()*this.count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
