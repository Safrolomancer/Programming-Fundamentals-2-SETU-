public class CollegeTest
{
    public static void main(String[] args) {
        Undergraduate undergraduate_1 = new Undergraduate("MK", "Bsc in Computer Science", 10001, 1, 84.3);
        Postgraduate postgraduate_1 = new Postgraduate("Ben", "Computer Science", "Cybersecurity", "Dr. Carl Steffan", 50001);
        
        undergraduate_1.printInfo();
        postgraduate_1.printInfo();
    }
}