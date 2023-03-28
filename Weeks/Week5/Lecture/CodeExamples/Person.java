import java.util.*;

class Person{
	private String name;
	private Date born,died;

	public Person(){
		this(null,null,null);
	}

	public Person(String name, Date born, Date died){
		setName(name);	
		setDates(born, died);
	}

	public void setName(String name){
		if (name == null)
			this.name = "John Doe";
		else
			this.name = name;
	}
	
	public void setDates(Date born, Date died){
		if (consistent(born,died)){
			this.born = new Date(born);
			if (died == null)
				this.died = null;
			else
				this.died = new Date(died);
		} else {
			this.born = new Date();
			this.died = null;
		}
	}

	public String toString(){
		return String.format("%s, %s - %s", name, born.toString(), died == null ? "..." : died.toString());
	}

	private static boolean consistent(Date birth, Date died){
		if (birth == null )
			return false;
		else if (died == null)
			return true;
		else
			return died.after(birth);
	}
};
