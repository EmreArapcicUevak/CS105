public class Student extends Person {
	private int ID;
	private String course, teacher;


	public Student(String firstName, String lastName, int ID, String course, String teacher){
		super(firstName,lastName);
		setID(ID);
		setCourse(course);
		setTeacher(teacher);
	}

	public void setID(int ID){
		if (ID < 0)
			this.ID = 0;
		else
			this.ID = ID;
	}

	public void setCourse(String course){
		if (course == null)
			this.course = "None";
		else
			this.course = course;
	}

	public void setTeacher(String firstName){
		if (teacher == null)
			this.teacher = "John Doe";
		else
			this.teacher = teacher;
	}

	public String getCourse(){return this.course;}
	public String getTeacher(){return this.teacher;}
	public int getID(){return this.ID;}

	public String displayDetail(){
		return String.format("%s\nStudent ID: %d\nCourse: %s\nTeacher: %s",super.displayDetail(),ID,course,teacher);
	}

	public boolean equals(Object Obj){
		if (super.equals(Obj)){
			Student nObj = (Student) Obj;
			return nObj.ID == ID && nObj.course.equals(course) && nObj.teacher.equals(teacher);
		}else
			return false;
	}
};
