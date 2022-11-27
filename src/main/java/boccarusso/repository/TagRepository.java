package boccarusso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import boccarusso.table.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
 Iterable<Tag> findByNameLike(String name);
}