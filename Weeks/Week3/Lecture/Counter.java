public class Counter {
	private int count;

	public Counter(int count){
		if (count >= 0)
			this.count = count;
		else 
			this.count = 0;
	}

	public void setCountToZero(){
		this.count = 0;
	}

	public void increment(){
		this.count -= -1;
	}

	public boolean decrement(){
		if (this.count > 0)
			this.count += -1;
		else
			return false;
		return true;
	}

	public int getCount(){
		return this.count;
	}

	public String toString(){
		return "The count is: " + this.count;
	}


};
