package boccarusso.table;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
 @Id
 private Integer id;
 private String slug;
 private String title;
 private String intro;
 private String image;
 private String tags;
 private String creation;
 private String lastUpdate;
 @Column(columnDefinition="TEXT")
 private String content;
 
 public Integer getId() {
  return id;
 }
 
 public void setId(Integer id) {
  this.id = id;
 }
 
 public String getSlug() {
  return slug;
 }
 
 public void setSlug(String slug) {
  this.slug = slug;
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
 
 public String getTags() {
  return tags;
 }
 
 public void setTags(String tags) {
  this.tags = tags;
 }
 
 public String getCreation() {
  return creation;
 }
 
 public void setCreation(String creation) {
  this.creation = creation;
 }
 
 public String getLastUpdate() {
  return lastUpdate;
 }
 
 public void setLastUpdate(String lastUpdate) {
  this.lastUpdate = lastUpdate;
 }
 
 public String getContent() {
  return content;
 }
 
 public void setContent(String content) {
  this.content = content;
 }
 
 @Override
 public String toString() {
  return "{"
   + String.format("\"id\":\"%s\",", id)
   + String.format("\"slug\":\"%s\",", slug)
   + String.format("\"title\":\"%s\",", title)
   + String.format("\"intro\":\"%s\",", intro)
   + String.format("\"image\":\"%s\",", image)
   + String.format("\"tags\":\"%s\",", tags)
   + String.format("\"creation\":\"%s\",", creation)
   + String.format("\"lastUpdate\":\"%s\",", lastUpdate)
   + String.format("\"content\":\"%s\"", content) 
   + "}";
 }
}