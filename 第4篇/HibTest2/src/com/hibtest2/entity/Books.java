package com.hibtest2.entity;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String author;
	//private Integer publisherId;
	private Publishers publishers;
	public Publishers getPublishers() {
		return publishers;
	}

	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}

	private Integer publisherDate;
	private String isbn;
	private Integer wordsCount;
	private Integer unitPrice;
	private String contentDescription;

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** minimal constructor */
	public Books(String title, String author, Integer publisherId) {
		this.title = title;
		this.author = author;
		//this.publisherId = publisherId;
	}

	/** full constructor */
	public Books(String title, String author, Integer publisherId,
			Integer publisherDate, String isbn, Integer wordsCount,
			Integer unitPrice, String contentDescription) {
		this.title = title;
		this.author = author;
		//this.publisherId = publisherId;
		this.publisherDate = publisherDate;
		this.isbn = isbn;
		this.wordsCount = wordsCount;
		this.unitPrice = unitPrice;
		this.contentDescription = contentDescription;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/*public Integer getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}*/

	public Integer getPublisherDate() {
		return this.publisherDate;
	}

	public void setPublisherDate(Integer publisherDate) {
		this.publisherDate = publisherDate;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getWordsCount() {
		return this.wordsCount;
	}

	public void setWordsCount(Integer wordsCount) {
		this.wordsCount = wordsCount;
	}

	public Integer getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getContentDescription() {
		return this.contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

}