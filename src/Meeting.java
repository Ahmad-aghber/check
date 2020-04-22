import java.util.ArrayList;
import java.util.Date;

public class Meeting {
    private ArrayList<Employee> employees ;
    private Date dateOfMeething;

    public Meeting(Date dateOfMeething){
        if(dateOfMeething == null)
            throw new IllegalArgumentException();
        employees = new ArrayList<>();
        this.dateOfMeething = dateOfMeething;
    }

    public void addEmployee(Employee employee){
        if(employee == null)
            throw new IllegalArgumentException();
        employees.add(employee);
    }
    //todo add method called removeLastEmployee to remove last employee in the list employees



    public void printEmployees(){
        //todo print employee number
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee number : " + i);
            System.out.println(employees.get(i));
        }
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Date getDateOfMeething() {
        return dateOfMeething;
    }

    public void setDateOfMeething(Date dateOfMeething) {
        this.dateOfMeething = dateOfMeething;
    }
}
