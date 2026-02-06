public class Student {
    private long ID;
    private String Name;
    private String Surname;
    private double GPA;

    public Student(long ID, String Name, String Surname, double GPA){
        this.ID=ID;
        this.Name=Name;
        this.Surname=Surname;
        this.GPA=GPA;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public double getGPA() {
        return GPA;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public void setName( String Name){
        this.Name= Name;
    }
    public void setSurname(String Surname){
        this.Surname=Surname;
    }
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
}
