package com.lovingscience.reviews;

public class Review {

	private long id;
	private String name;
	private String url;
	private String category;
	private String content;

	public Review(Long id, String name, String url, String category, String content) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.category = category;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;

	}
}
