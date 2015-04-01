package inheritanceInSpring;

public class MyBean {
	private String name;
	private String address;
	public void setName(String name) {
	  this.name = name;
	  }
	public void setAddress(String address) {
	  this.address = address;
	  }
	@Override
	public String toString() {
	  final StringBuilder stringBuilder = new StringBuilder();
	  stringBuilder.append("Bean");
	  stringBuilder.append("{name='").append(name).append('\'');
	  stringBuilder.append(", address=").append(address);
	  stringBuilder.append('}');
	  return stringBuilder.toString();
      }
}