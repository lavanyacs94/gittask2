package org.allvehicle;

import org.fourwheeler.Fourwheeler;
import org.threewheeler.Threewheeler;
import org.twowheeler.TwoWheller;

public class Vehicle
{
	public void vehiclenecessary() 
	{
		System.out.println("vehicle is necessary");

	}
	
public static void main(String[] args)
{
	Vehicle v=new Vehicle();
	v.vehiclenecessary();
	TwoWheller tw=new TwoWheller();
	tw.bike();
	tw.cycle();
	Threewheeler thw=new Threewheeler();
	thw.Auto();
	Fourwheeler fw=new Fourwheeler();
	fw.bus();
	fw.car();
	
	}
}

