package com.sthien.joblisting.repository;

import com.sthien.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
