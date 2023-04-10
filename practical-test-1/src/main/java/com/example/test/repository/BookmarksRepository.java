package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.entity.Bookmarks;

public interface BookmarksRepository extends JpaRepository<Bookmarks, Long> {

}
