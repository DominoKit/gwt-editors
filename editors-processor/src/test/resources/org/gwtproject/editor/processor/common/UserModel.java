package org.gwtproject.editor.processor.common;

public interface UserModel {
  
  Long getId();
  
  void setId(Long id);
  
  String getFirstName();
  
  void setFirstName(String firstName);
  
  String getLastName();
  
  void setLastName(String lastName);
  
  String getEmail();
  
  void setEmail(String email);
  
  int getAge();
  
  void setAge(int age);
  
  String getPhone();
  
  boolean isActive();

  void setActive(boolean active);
  
}