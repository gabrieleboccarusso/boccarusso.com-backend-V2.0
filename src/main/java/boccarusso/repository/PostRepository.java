package boccarusso.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import boccarusso.table.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
 Iterable<Post> findAllByTitleLike(String title);

 Iterable<Post> findByIdBetweenOrderByIdDesc(int end, int begin);
 
 @Query("SELECT max(id) FROM Post")
 public Long findMaxId();
 
 @Query("SELECT ap.postId FROM AppliedTag ap WHERE ap.tagId = (SELECT t.id FROM Tag t WHERE t.name = :name)")
 Iterable<Integer> getIdsWithTag (String name);

 Post findBySlugLike(String slug);
}
