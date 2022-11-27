package boccarusso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import boccarusso.table.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

 Iterable<Project> findAllByOrderByIdDesc();
}