package collectionProgram;

public class Student implements Comparable<Student> {
private Integer sid;
private String sname;
private String email;
private Double totalmarks;
private Integer age;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(Double totalmarks) {
	this.totalmarks = totalmarks;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Student(Integer sid, String sname, String email, Double totalmarks, Integer age) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.email = email;
	this.totalmarks = totalmarks;
	this.age = age;
}
@Override
public String toString() {
	return "\nStudent id=" + sid + ", \n sname=" + sname + ", \nemail=" + email + ", \ntotalmarks=" + totalmarks + ", \nage="
			+ age +"________________________________________________________";
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.sid.compareTo(sid);
}

}
