package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_book")
@Data
@Setter
@Getter

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String description;
	@Column(name="unit_price")
	private BigDecimal unitPrice;	
	@Column(name="image_url")
	private String imageurl;
	private Boolean active;
	@Column(name="units_in_stock")
	private int unitsInStock;
	@Column(name="date_created")
	private Date createdOn;
	@Column(name="last_updated")
	private Date updatedOn;
	
	
	/*public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}
    
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
    public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Date getDateCreatedOn() {
		return dateCreatedOn;
	}
	public void setDateCreatedOn(Date dateCreatedOn) {
		this.dateCreatedOn = dateCreatedOn;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}
*/

	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;

}
