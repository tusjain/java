package inheritanceInSpring;

public class YourBean {
	private String name1;
	private String address1;
	public void setName(String name1) {
	  this.name1 = name1;
	  }
	public String getName1(){
		return name1;
	}
	public void setAddress(String address1) {
	  this.address1 = address1;
	  }
	@Override
	public String toString() {
	  final StringBuilder stringBuilder = new StringBuilder();
	  stringBuilder.append("Bean1");
	  stringBuilder.append("{name1='").append(name1).append('\'');
	  stringBuilder.append(", address1=").append(address1);
	  stringBuilder.append('}');
	  return stringBuilder.toString();
      }
}
