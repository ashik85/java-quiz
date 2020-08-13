public class StudentFailsException extends Exception{
	private int count;
	
	public StudentFailsException(int count){
	     this.count=count;
	}

    public int getcount(){
         return count;
    }

}