import java.util.*;
public class Admin
{
	public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int num;
        ArrayList<Customer> list = new ArrayList<Customer>();
     	int[] randam;
        Scanner obj = new Scanner(System.in);

        do
        {
            System.out.println("Select 1: for Add New Customer" + "\n" +  "Select 2: for Add Car details To existing Customer " + "\n" + "Select 3: Show all Customer Deatils sorted By Name" +"\n"
			+ "Select 4: Search indiviual ById" + "\n" + "Select 5: Random Number"+"\n" + "Select 0: for Exit ");
			num = sc.nextInt();
			switch (num) 
			{
 				case 1: list.add(new Customer());
         				break;
   
 				case 2:	int carId;
			            String carModel;
			            double carPrice;
			            Scanner obj1=new Scanner(System.in);
			            Scanner obj2=new Scanner(System.in);
				        System.out.println("Enter Id Of Customer:");
				        int x=obj1.nextInt();
				        for(int i=0;i<list.size();i++)
				        {
				        	if (list.get(i).getId() == x)
				        	{  
					           Customer customer=list.get(i);
					           ArrayList<Car> listOfCars=  customer.getCarList();
					           Car car=null;
					           System.out.println("Enter CarType( press 1: for Maruti, 2: for Hyundai, 3: for Toyota )");
					           int carType=obj1.nextInt();
					           switch (carType) 
					           {
						            case 1:	System.out.println("Enter car Id,car model and car Price");
						                   	carId=obj1.nextInt();
						                    carModel=obj2.next();
						                    carPrice=obj1.nextDouble();
						                    car = new Maruti(carId,carModel,carPrice);
						                    listOfCars.add(car);
						                    customer.setCarList(listOfCars);
						                    break;
						            case 2: System.out.println("Enter car Id,car model and car Price");
						                    carId=obj1.nextInt();
						                    carModel=obj2.next();
						                    carPrice=obj1.nextDouble();
						                    car = new Hyundai(carId,carModel,carPrice);
						                    listOfCars.add(car);
						                    customer.setCarList(listOfCars);
						                   	break;
						            case 3:	System.out.println("Enter car Id,car model and car Price");
						                	carId=obj1.nextInt();
							                carModel=obj2.next();
							                carPrice=obj1.nextDouble();
							                car=new Toyota(carId,carModel,carPrice);
							                listOfCars.add(car);
							                customer.setCarList(listOfCars);
						                   	break;
						            default:System.out.println("Car Type Does not Exist");
						                   	break;
						            
					            }
			           
							} 
				       		else
				           	{
				               System.out.println("Id Not Exist Need To Add New Customer!"); 
				           	}
				    	}
       					break;
 
 
 case 3:Collections.sort(list);
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println("Customer Id : " + list.get(i).getId() + " Name : "+ list.get(i).getName() );
        for(Car carDetail : list.get(i).getCarList())
        {
         System.out.println("Car Id: "+carDetail.getCarId() +" Car Model : "+carDetail.getCarModel()+" Car Price: "+carDetail.getCarPrice()+
                 " Resales Price :"+carDetail.getResalePrice());
        }
        } 
         break;

 case 4:RandomNumber search = new RandomNumber();
            int count=0;
            for (int i = 0; i < list.size(); i++)
            {
                int x1 = search.getCusId();
                if (list.get(i).getId() == x1)
                { 
                    System.out.println("Name of Customer: "
                    + list.get(i).getName());
                     for(Car carDetail : list.get(i).getCarList())
                     {
                            System.out.println("Car Name  "+carDetail.getCarModel());
                     }
                }
               else
               {
               		System.out.println("Customer Id is incorrect");
               }
            }
            break;

case 5:
          // here user Randon to distubute prize
            int flag=0;
            Random random = new Random();
            RandomNumber r = new RandomNumber();
            randam = new int[6];
            for (int i = 0; i < 6; i++) 
            {
                int index = random.nextInt(list.size());
                 randam[i] = list.get(index).getId();
            }
            for (int i = 0; i < 6; i++) 
            { 
              
                if (randam[i] == r.num1) 
                {
                    flag++;
                	System.out.println("Id : " + randam[i] + " prize Winner");
                	break;
                }
                else if (randam[i] == r.num2) 
                {
                    flag++;
                	System.out.println("Id : " + randam[i] + " prize Winner");
                 	break;
                }
                else  if (randam[i] == r.num3) 
                {
                    flag++;
                	System.out.println("Id : " + randam[i] + " prize Winner");
                  	break;
                } 
           } 
           if(flag==0)
           {
           		System.out.println("Better Luck For next time :)");
           }
           break;
		}

	} while (num != 0);
}
}	