package Java_8;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import Java_8.Student;
class PercentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.percent == s2.percent)
			return 0;
		else if (s1.percent< s2.percent)
			return -1;
		else
			return 1;
	}

}
public class SortExample {

	public static void main(String[] args) {
		/**
		 * Sort the names
		 */
		Stream<String> names = Stream.of("Rahul", "Dinesh", "Ramesh", "Suresh");
		//names.sorted().forEach((s)->System.out.println(s));
		//names.sorted(Comparator.reverseOrder()).forEach((s)->System.out.println(s));
		
		/**
		 * Sort the students by percentage
		 */
		Student s1=new Student(1, "Rahul", 56, null);
		Student s2=new Student(1, "Dinesh", 91, null);
		Student s3=new Student(1, "Suresh", 78, null);
		Student s4=new Student(1, "Ramesh", 96, null);
		List<Student> stdList=List.of(s1,s2,s3,s4);
		stdList.stream().sorted(Comparator.comparingDouble(s->s.getPercent()))
		.forEach(s->System.out.println(s.name));
	}

}
