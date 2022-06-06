package service;

import model.Post;

import java.util.List;

public interface PostService extends GeneralService<Post> {
    List<Post> findAll();
    List<Post> findByName(String name);
}
