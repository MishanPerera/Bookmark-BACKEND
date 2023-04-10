package com.example.test.service;

import java.util.List;

import com.example.test.entity.Bookmarks;

public interface BookmarksService {
	List<Bookmarks> getAllBookmarks();
	Bookmarks getBookmarkById(Long id);
	Bookmarks editBookmark(Bookmarks bookmarks);
	void deleteBookmarkById(Long id);
}
