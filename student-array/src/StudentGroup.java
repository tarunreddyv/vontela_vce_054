import java.util.Arrays;
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
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null) 
			throw new IllegalArgumentException("STUDENT ARRAY CANNOT BE NULL");
		
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index==0 || index>= students.length)
			throw new IllegalArgumentException("index cannot be lower or higher");
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students==null) 
			throw new IllegalArgumentException("STUDENT ARRAY CANNOT BE NULL");
		if(index==0 || index>= students.length)
			throw new IllegalArgumentException("index cannot be lower or higher");
		students[index]=student;
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students==null) 
			throw new IllegalArgumentException("STUDENT ARRAY CANNOT BE NULL");
		if(index==0 || index>= students.length)
			throw new IllegalArgumentException("index cannot be lower or higher");
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		 int n = students.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(students[j-1] > students[j]){  
	                                 //swap elements  
	                                 temp = students[j-1];  
	                                 studenta[j-1] = students[j];  
	                                 students[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int k=0;
		if(date=null)
			throw new IllegalArgumentException("DATE CANNOT BE NULL");
		Student[] st= new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate.compareTo(date)<=0)
			{
				st[k]=students[i];
				k++;
			}
		}
		if(k==0)
		return null;
		else
			return Arrays.copyOf(st,0,k-1);
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null || lastDate==null)
		throw new IllegalArgumentException("date cannot be null");
		Student[] st= new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate.compareTo(firstDate)<=0 && students[i].getBirthDate.compareTo(lastDate)>=0 )
			{
				st[k]=students[i];
				k++;
			}
		}
		if(k==0)
		return null;
		else
			return Arrays.copyOf(st,0,k-1);
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
		//for(i=0;i<)
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int k=0;
		for(int i=0;i<students.length-1;i++)
		{
			if(students[i].compareTo(student)==0)
			{
				return students[i+1];
			}
	}
		return null;
}
