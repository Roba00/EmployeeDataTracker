public class Employee
{
    private String name;
    private int id;
    private String address;
    private int socialSecurity;
    private float wage;
    private String jobFunction;

    public Employee(String name, int id, String address, int socialSecurity,
                    float wage, String jobFunction)
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.socialSecurity = socialSecurity;
        this.wage = wage;
        this.jobFunction = jobFunction;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public String getAddress()
    {
        return this.address;
    }

    public int getSocialSecurity()
    {
        return this.socialSecurity;
    }

    public float getWage()
    {
        return this.wage;
    }

    public String getJobFunction()
    {
        return this.jobFunction;
    }
}