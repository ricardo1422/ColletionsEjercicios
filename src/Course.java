
public class Course
{

    String name;

    String id;

    int credits;

    public Course( String name, String id, int credits )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    @Override
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
    
    public int getCredits() {
    	return this.credits;
    }
    public String getCourseName()
    {
    	return this.name;
    }
}