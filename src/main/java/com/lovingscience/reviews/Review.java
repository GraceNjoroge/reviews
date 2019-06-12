package com.lovingscience.reviews;

public class Review {

	private long id;
	private String title;
	private String url;
	private String category;
	private String content;

	public Review(Long id, String title, String url, String location, String synopsis) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.category = location;
		this.content = synopsis;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
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


