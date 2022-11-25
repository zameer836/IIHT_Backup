package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortCourseData {
	
	public static void main(String[] args) {
		
		ArrayList<CourseData> courselist = new ArrayList<>();
		
		courselist.add(new CourseData(1, "java", "Adam", 32, 22000));
		courselist.add(new CourseData(2, "python", "sameer", 54, 12000));
		courselist.add(new CourseData(3, "ML", "raju", 11, 32000));
		courselist.add(new CourseData(4, "mobile app dev", "prashant", 66, 11000));
		courselist.add(new CourseData(5, "data analytics", "rajni", 34, 77000));
		courselist.add(new CourseData(6, "devops", "bhavani", 44, 13000));
		courselist.add(new CourseData(7, "UI dev", "febha", 31, 28000));
		courselist.add(new CourseData(8, "database", "ganesh", 29, 39000));
		courselist.add(new CourseData(9, "cybersecurity", "sahu", 67, 59000));
		courselist.add(new CourseData(10, "sql", "vinod", 78, 79000));
		courselist.add(new CourseData(11, "powerBI", "ajaz", 48, 56000));
		courselist.add(new CourseData(12, "Tableau", "sohail", 39, 84000));
		courselist.add(new CourseData(13, "Bigdata", "archana", 63, 30000));
		courselist.add(new CourseData(14, "AI", "ashok", 84, 61000));
		courselist.add(new CourseData(15, "Rsoftware", "sravan", 77, 81000));
		
		System.out.println(courselist);
		ArrayList<CourseData> sortedListByFeesAscending = new ArrayList<>();
		sortedListByFeesAscending = sortByPricesAscending(courselist);
		System.out.println("sorted list by fee ascending");
		System.out.println(sortedListByFeesAscending);
		
		
		ArrayList<CourseData> sortedListByFeesDescending = new ArrayList<>();
		sortedListByFeesDescending = sortByFeesDescending(courselist);
		System.out.println("sorted list by fee descending");
		System.out.println(sortedListByFeesDescending);
		
		
		ArrayList<CourseData> sortedListByDurationAscending = new ArrayList<>();
		sortedListByDurationAscending = sortByDurationAscending(courselist);
		System.out.println("sorted list by Course Duration Ascending");
		System.out.println(sortedListByDurationAscending);
		
		
		
	}

	private static ArrayList<CourseData> sortByPricesAscending(ArrayList<CourseData> courselist) {
		// TODO Auto-generated method stub
		
		ArrayList<CourseData> resultList = new ArrayList<>();
		Collections.sort(courselist, (a,b)->{
			if(a.getFees()==b.getFees())
				return 0;
			else if(a.getFees()>b.getFees())
				return 1;
			else return -1;
			
			
		});
		resultList=courselist;
		return resultList;
		
	}
	
	private static ArrayList<CourseData> sortByFeesDescending(ArrayList<CourseData> courselist) {
		// TODO Auto-generated method stub
		
		ArrayList<CourseData> resultList = new ArrayList<>();
		Collections.sort(courselist, (a,b)->{
			if(a.getFees()==b.getFees())
				return 0;
			else if(a.getFees()<b.getFees())
				return 1;
			else return -1;
		});
		resultList=courselist;
		return resultList;
	}
	
	private static ArrayList<CourseData> sortByDurationAscending(ArrayList<CourseData> courselist) {
		// TODO Auto-generated method stub
		
		ArrayList<CourseData> resultList = new ArrayList<>();
		Collections.sort(courselist, (a,b)->{
			if(a.getDuration()==b.getDuration())
				return 0;
			else if(a.getDuration()>b.getDuration())
				return 1;
			else return -1;
		});
		resultList=courselist;
		return resultList;
	}
	
	}