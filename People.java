public class People {

	private String name;
	private String familyName;

	public People(name, familyName) {
		this.name = name;
		this.familyName = familyName;
	}

	@Override
    public String toString() {
        return name + " " + familyName;
    }
}
