package com.test.entity;

public class News {
	private int newsId;
	private String content;
	private String imgs;
	
	public News() {
		super();
	}
	
	public News(int newsId, String content, String imgs) {
		super();
		this.newsId = newsId;
		this.content = content;
		this.imgs = imgs;
	}



	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	
}
