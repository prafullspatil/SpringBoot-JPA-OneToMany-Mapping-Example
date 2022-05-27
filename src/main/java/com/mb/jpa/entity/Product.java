package com.mb.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	private String productName;

	private Integer qty;

	private Integer price;

	public Product(Integer pid, String productName, Integer qty, Integer price)
	{
		super();
		this.pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}

	public Product()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPid()
	{
		return pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public Integer getQty()
	{
		return qty;
	}

	public void setQty(Integer qty)
	{
		this.qty = qty;
	}

	public Integer getPrice()
	{
		return price;
	}

	public void setPrice(Integer price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Product [pid=" + pid + ", productName=" + productName + ", qty=" + qty + "]";
	}

}
