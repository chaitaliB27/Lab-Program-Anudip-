package collectionProgram;

/*
 * Comparable interface is used to compare object based on one of its properties.
 * when we want to sort collection of user defined object using sort method of the collection 
 * class we need to specify  how the object have to be compared before sorting  
 * 
 * 
 * This is done with help of comparable
 */
public class PojoPerson implements Comparable<PojoPerson> {//comparable is helping class for 
	//comparing member of Arraylist.only by using only one attribute of member(Object).
	private Integer personId;
	private String name;
	private Boolean adult;
	private Integer age;
	private String nationality;

	public PojoPerson(Integer personId, String name, Boolean adult, Integer age, String nationality) {
		super();
		this.personId = personId;
		this.name = name;
		this.adult = adult;
		this.age = age;
		this.nationality = nationality;

	}

	public PojoPerson() {
		super();
	}
	
     @Override
	public String toString() {
		return "\nPojoPerson [personId=" + personId + ", name=" + name + ", adult=" + adult + ", age=" + age
				+ ", nationality=" + nationality + "]";
	}

	public int compareTo(PojoPerson p) {//Here we was used persoId attribute for compare.
		return this.personId.compareTo(p.personId);
    	 
    	 
     }
}
