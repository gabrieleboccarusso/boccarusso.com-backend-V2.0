package boccarusso.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boccarusso.repository.ProjectRepository;
import boccarusso.table.Project;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/projects")
public class ProjectController {
 private final ProjectRepository repository;
 ProjectController(ProjectRepository repository) {
  this.repository = repository;
 }
 
 @GetMapping("/")
 Iterable<Project> all() {
  return repository.findAll();
 }
 
 @GetMapping("projectsDescending")
 Iterable<Project> allDesc() {
  return repository.findAllByOrderByIdDesc();
 }
}