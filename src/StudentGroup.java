import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students[];
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		return students[i];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
	    if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		
		students[ind]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		int n=students.length -1;
		
		for(int i=n;i>=0;i--)
		{
			students[i+1]=students[i];
		}
		students[0]=student;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
			int n=students.length ;
			students[n]=student;
			
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
	    if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		int ind=index;
		int n=students.length -1;
		
		for(int i=n;i>=ind;i--)
		{
			students[i+1]=students[i];
		}
		students[ind]=student;
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		  if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		int n=students.length -1;
		for(int i=ind;i<n-1;i++)
		{
			students[i]=students[i+1];
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		  if(index<0||index>=students.length)
			throw new IllegalArgumentException();
	    int ind,n=students.length -1;
		for( int i=0;i<=n;i++)
		{
			if(students[i].equals(student))
			{
				ind=i;
				break;
				
			}
			
		}
	   for( i=ind;i<n-1;i++)
		{
			students[i]=students[i+1];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		
		// Add your implementation here
		    if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		students.length=index+1;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		  if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		int ind,n=students.length -1;
		for( int i=0;i<=n;i++)
		{
			if(students[i].equals(student))
			{
				ind=i;
				break;
				
			}
			
		}
		students.length=ind+1;
		
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		   if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		int ind=index,n=students.length -1;
		for(int i=0;i<ind;i++)
		{
			students[i]=students[ind+i];
		}
		for(int i=ind;i<=n-ind-1;i++)
		{
			students[i]=students[ind+i];
		}
			students.length=n-ind;
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		    if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		int ind,n=students.length -1;
		for( int i=0;i<=n;i++)
		{
			if(students[i].equals(student))
			{
				ind=i;
				break;
				
			}
			
		}
		for(int i=0;i<ind;i++)
		{
			students[i]=students[ind+i];
		}
		for(int i=ind;i<=n-ind-1;i++)
		{
			students[i]=students[ind+i];
		}
			students.length=n-ind;
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
