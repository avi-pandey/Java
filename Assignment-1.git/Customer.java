import java.util.*;
public class Customer implements Comparable< Customer> 
{

    public int id;
    public String name;
    public ArrayList<Car> carList;

  public  Customer() {
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter ID, Name");
        id = obj1.nextInt();
        name = obj2.next();
        this.carList = new ArrayList<Car>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> CarList) {
        this.carList = CarList;
    }
    

    public int compareTo(Customer o) 
    {
        //sort the arraylist by class object
        int compareInt = this.name.compareTo(o.name);
        if (compareInt < 0) {
            return -1;//return this.Name is bigger
        }
        if (compareInt > 0) {
            return 1;//return other.Name is bigger
        }
        return 0;//return they are equal
    }
    

}