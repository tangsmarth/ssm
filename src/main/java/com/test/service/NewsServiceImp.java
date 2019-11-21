package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.NewsDao;
import com.test.entity.News;

@Service
public class NewsServiceImp implements NewsService{
	@Resource
    private NewsDao newsDao;

	public News findnews() {
		// TODO Auto-generated method stub
		return newsDao.findnews();
	}
}
