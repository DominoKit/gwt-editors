package org.gwtproject.editor.processor.common;

public class UserDto
    implements UserModel {
  
  private Long    id;
  private String  email;
  private String  firstName;
  private String  lastName;
  private int     age;
  private String  phone;
  private boolean active;
  
  public UserDto() {
    // jackson serialization
  }
  
  public UserDto(Long id,
                 String email,
                 String firstName,
                 String lastName,
                 int age,
                 String phone,
                 boolean active) {
    this.id        = id;
    this.email     = email;
    this.firstName = firstName;
    this.lastName  = lastName;
    this.age       = age;
    this.phone     = phone;
    this.active    = active;
  }
  
  @Override
  public Long getId() {
    return id;
  }
  
  @Override
  public void setId(Long id) {
    this.id = id;
  }
  
  @Override
  public String getEmail() {
    return email;
  }
  
  @Override
  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public String getFirstName() {
    return firstName;
  }
  
  @Override
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  @Override
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  @Override
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  @Override
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  @Override
  public boolean isActive() {
    return active;
  }
  
  @Override
  public void setActive(boolean active) {
    this.active = active;
  }
  
  @Override
  public String toString() {
    return "UserDto{" +
           "id=" + id +
           ", email='" + email + '\'' +
           ", firstName='" + firstName + '\'' +
           ", lastName='" + lastName + '\'' +
           ", age=" + age +
           ", phone='" + phone + '\'' +
           ", active=" + active +
           '}';
  }
  
}