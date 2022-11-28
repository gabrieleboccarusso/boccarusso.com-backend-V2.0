package boccarusso.controller;

import java.util.LinkedList;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boccarusso.repository.PostRepository;
import boccarusso.table.Post;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/posts")
public class PostController {
 private final PostRepository repository;
 
 PostController(PostRepository repository) {
  this.repository = repository;
 }
 
 @GetMapping
 Iterable<Post> all() {
  return repository.findAll();
 }
 
 @GetMapping("/maxId")
 Long MaxPostId() {
  return repository.findMaxId();
 }
 
 @GetMapping("/getByTitle/{title}")
 Iterable<Post> getPostsByTitle(@PathVariable String title) {
  return repository.findAllByTitleLike('%' + title + '%');
 }
 
 @GetMapping("/getBySlug/{slug}")
 Post getPostsBySlug(@PathVariable String slug) {
  return repository.findBySlugLike(slug);
 }
 
 @GetMapping("/between/{end}/{begin}")
 Iterable<Post> postsBetween(@PathVariable int end, @PathVariable int begin) {
  return repository.findByIdBetweenOrderByIdDesc(end, begin);
 }
 
 @GetMapping("/getByTag/{tag}")
 LinkedList<Optional<Post>> getPostsByTag(@PathVariable String tag){
  LinkedList<Optional<Post>> posts = new LinkedList<>();
  Iterable<Integer> ids = repository.getIdsWithTag(tag);
  for(Integer id : ids) {
   posts.add(repository.findById(id));
  }
  return posts;
 }
}