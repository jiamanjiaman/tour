package com.collect;

import java.util.HashMap;
import java.util.Map;

import com.skishop.entity.Product;

public class Cart {
	private Map<Integer,CartItem> map=new HashMap<Integer,CartItem>();
	private int price;
	public Map<Integer, CartItem> getMap() {
		return map;
	}
	public void setMap(Map<Integer, CartItem> map) {
		this.map = map;
	}
	public int getPrice() {
		int totalPrice=0;
		for(Map.Entry<Integer, CartItem> entry: map.entrySet()){
			CartItem item=entry.getValue();
			totalPrice=totalPrice+item.getPrice();
			this.price=totalPrice;
		}
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void addCartItem(Product p){
		if(map.containsKey(p.getId())){
			CartItem ci=map.get(p.getId());
			ci.setCount(ci.getCount()+1);
			
		}else{
			CartItem ci=new CartItem();
			ci.setProduct(p);
			ci.setCount(1);
			map.put(p.getId(), ci);
			
		}
	}
	

}
