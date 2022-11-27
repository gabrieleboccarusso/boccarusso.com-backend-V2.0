package boccarusso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boccarusso.table.AppliedTag;

public interface AppliedTagRepository extends JpaRepository<AppliedTag, Integer>{
 Iterable<AppliedTag> findByTagIdLike(Integer id);
}