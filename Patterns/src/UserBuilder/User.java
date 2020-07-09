package UserBuilder;

public class User {

	int id;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + ", town=" + town + "]";
	}

	String name;
	String phone;
	String adress;
	String town;
	
	
	public User(BuilderClass builder) {
		
		this.id = builder.id;
		this.name = builder.name;
		this.phone = builder.phone;
		this.adress = builder.adress;
		this.town = builder.town;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return adress;
	}
	public String getTown() {
		return town;
	}
	
	public static class BuilderClass{
		
		int id;
		String name;
		String phone;
		String adress;
		String town;
		
		public BuilderClass(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public BuilderClass phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public BuilderClass adress(String adress) {
			this.adress = adress;
			return this;
		}
		
		
		public User Build() {
			User user = new User(this);
			return user;
		}

	}
	
	
}
