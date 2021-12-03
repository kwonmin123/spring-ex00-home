package lecture.p03core;

public class App2 {
	public static void main(String[] args) {
		
		MyServlet s2 = new MyServlet();
		s2.setDao(new MyDao()); // 
		
		s2.doGet();
		System.out.println(s2.toString());
	}
}
//lecture.p03core.MyServlet@15db9742
//lecture.p03core.MyServlet@15db9742