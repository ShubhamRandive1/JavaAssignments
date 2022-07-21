public class Course {

    int courseid;
    String courseName;
    int courseFee;


    public Course(){

    }

    public Course(int courseid,String courseName,int courseFee)
    {
        this.courseid = courseid;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    //getter and setter for all the instances

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }


    public void displayCourseDetails(){
        System.out.println("The Course id is "+" "+this.getCourseid());
        System.out.println("The Course Name is "+" "+this.getCourseName());
        System.out.println("The Course Fees is "+" "+this.getCourseFee());
    }
}
