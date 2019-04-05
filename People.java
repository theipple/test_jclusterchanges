public class People {

	private String firstName;
	private String familyName;

	private String birthday;

	public People(firstName, familyName, birthday) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthday = birthday;
	}

	@Override
    public String toString() {
        return firstName + " " + familyName;
    }

    public String getBirthday() {
    	return birthday;
    }
}
