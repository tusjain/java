package springInjectionExample;

class Inject {
  private String name;
  private int age;
  private String company;
  private String email;
  private String address;
 public void setAddress(String address) {
  this.address = address;
  }
  public void setCompany(String company) {
  this.company = company;
  }
 public void setEmail(String email) {
  this.email = email;
  }
  public void setAge(int age) {
  this.age = age;
  }
  public void setName(String name) {
  this.name = name;
  }

  @Override
  public String toString() {
  return String.format("Name: %s\n" +
		  "Age: %d\n" +
		  "Address: %s\n" +
		  "Company: %s\n" +
		  "E-mail: %s",
		  this.name, this.age, this.address, this.company, this.email);
  }
}