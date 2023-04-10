package com.example.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.entity.Bookmarks;
import com.example.test.repository.BookmarksRepository;
import com.example.test.service.BookmarksService;

@Service
public class BookmarksServiceImpl implements BookmarksService{
	
	private BookmarksRepository bookmarksRepository;

	public BookmarksServiceImpl(BookmarksRepository bookmarksRepository) {
		super();
		this.bookmarksRepository = bookmarksRepository;
	}


	@Override
	public List<Bookmarks> getAllBookmarks() {
		return bookmarksRepository.findAll();
	}


	@Override
	public Bookmarks editBookmark(Bookmarks bookmarks) {
		return bookmarksRepository.save(bookmarks);
	}


	@Override
	public void deleteBookmarkById(Long id) {
		bookmarksRepository.deleteById(id);
		
	}

	@Override
	public Bookmarks getBookmarkById(Long id) {
		return bookmarksRepository.findById(id).get();
	}

}
