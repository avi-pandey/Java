import java.util.*;
public abstract class Car
{
	public int carId;
	public String carModel;
	public double carPrice;
	public int getCarId() 
	{
        return carId;
    }

    public double getCarPrice() 
    {
        return carPrice;
    }

    public String getCarModel() 
    {
        return carModel;
    }
    abstract double getResalePrice();
}