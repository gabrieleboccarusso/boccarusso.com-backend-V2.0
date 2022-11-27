package boccarusso.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boccarusso.repository.AppliedTagRepository;
import boccarusso.table.AppliedTag;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/appliedTag")
public class AppliedTagController {
 private final AppliedTagRepository repository;
 
 AppliedTagController(AppliedTagRepository repository) {
  this.repository = repository;
 }
 
 @GetMapping("/")
 Iterable<AppliedTag> getAppliedTag() {
  return repository.findAll();
 }
 
 @GetMapping("/getByTag/{tagId}")
 Iterable<AppliedTag> getByTag(@PathVariable int tagId) {
  return repository.findByTagIdLike(tagId);
 }

}