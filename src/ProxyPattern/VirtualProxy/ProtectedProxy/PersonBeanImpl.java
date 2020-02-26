package ProxyPattern.VirtualProxy.ProtectedProxy;

public class PersonBeanImpl implements PersonBean {

	private String name;
	private String gender;
	private String interests;
	int rating;
	int ratingCount = 0;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	@Override
	public int getHotOrRating() {
		// TODO Auto-generated method stub
		if (ratingCount == 0)
			return 0;
		return (rating / ratingCount);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.interests = interests;
	}

	@Override
	public void setHotOrRating(int rating) {
		// TODO Auto-generated method stub
		this.rating = rating;
		ratingCount++;
	}

}
