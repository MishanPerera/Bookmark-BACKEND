package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.entity.Bookmarks;
import com.example.test.service.BookmarksService;

@Controller
public class BookmarksController {
	private BookmarksService bookmarksService;

	public BookmarksController(BookmarksService bookmarksService) {
		super();
		this.bookmarksService = bookmarksService;
	}
	
	@GetMapping("api/bookmarks")
	public String getAllBookmarks(Model model) {
		model.addAttribute("bookmarks", bookmarksService.getAllBookmarks());
		return "bookmarks";
	}
	
	@PostMapping("api/bookmarks/{id}")
	public String editBookmark(@PathVariable Long id, @ModelAttribute("bookmarks") Bookmarks bookmarks, Model model) {
		
		Bookmarks existingBookmark = bookmarksService.getBookmarkById(id);
		existingBookmark.setId(id);
		existingBookmark.setName(bookmarks.getName());
		existingBookmark.setUrl(bookmarks.getUrl());
		existingBookmark.setDescription(bookmarks.getDescription());
		existingBookmark.setStatus(bookmarks.getStatus());
		existingBookmark.setExpiryDate(bookmarks.getExpiryDate());
		
		bookmarksService.editBookmark(existingBookmark);
		return "redirect:/bookmarks";
	}
	
	@GetMapping("api/bookmarks/delete/{id}")
	public String deleteBookmarkById(@PathVariable Long id) {
		bookmarksService.deleteBookmarkById(id);
		return "redirect:/bookmarks";
	}
	
	

}
