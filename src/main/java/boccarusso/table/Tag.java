package boccarusso.table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tag {
 @Id
 private Long id;
 private String name;
  
 Tag () {}
   
 public Tag (String name) {
  this.setName(name);
 }
 
 public Long getId() {
  return id;
 }
   
 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
 
 @Override
 public String toString() {
  return this.name + "\n";
 }
}