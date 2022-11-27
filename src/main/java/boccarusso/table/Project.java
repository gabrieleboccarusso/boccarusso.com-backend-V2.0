package boccarusso.table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
 @Id
 private Integer id;
 private String title;
 private String intro;
 private String image;
 private String repoLink;

 public Integer getId() {
  return id;
 }
 
 public void setId(Integer id) {
  this.id = id;
 }
 
 public String getTitle() {
  return title;
 }
 
 public void setTitle(String title) {
  this.title = title;
 }
 
 public String getIntro() {
  return intro;
 }
 
 public void setIntro(String intro) {
  this.intro = intro;
 }
 
 public String getImage() {
  return image;
 }
 
 public void setImage(String image) {
  this.image = image;
 }
 
 public String getRepoLink() {
  return repoLink;
 }
 
 public void setRepoLink(String repoLink) {
  this.repoLink = repoLink;
 }
}