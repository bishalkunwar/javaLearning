package individualjavaProject;
import java.util.ArrayList;

		interface CarbonFootPrint{ 
			public Double getCarbonFootPrint();
		}

		public class CarbonFootPrinting {
			public static void main(String[] args) {
				int j=0;
				ArrayList<CarbonFootPrint> list=new ArrayList();
				
				list.add(new Building(50.8,60.888,70.3));
				list.add(new Car(20,30,40.8));
				list.add(new Bicycle(2,12));
				
				for(CarbonFootPrint i:list) {
					
					System.out.println(list.get(j));
					System.out.println("CarbonFoot Print it Releases is: "+i.getCarbonFootPrint());
					System.out.println();
					j++;
				}
				
			}
		}

		

	class Building implements CarbonFootPrint{
			double height;
			double storied;
			double width;
	
			public Building() {
				
			}
			
			public Building(double height, double storied, double width) {
				this.height=height;
				this.storied = storied;
				this.width=width;
			}
			

			public Double getCarbonFootPrint() {
				return (height*width*storied);
			}
			
			@Override
			public String toString() {
				return " Building\nHeight = "+this.height+" \twidth = "+this.width+" \thouse Story = "+this.storied;

			}
		}

		class Car implements CarbonFootPrint{
			
			double enginecapacity;
			double quantityofpetrol;
			double numberofgears;
			
			
			public Car() {
				
			}
			
			public Car(double engineSize, double petrolQuantity, double gears ) {
				this.enginecapacity=engineSize;
				this.quantityofpetrol=petrolQuantity;
				this.numberofgears=gears;
			}
			
			
			public Double getCarbonFootPrint() {
				return (this.enginecapacity*this.quantityofpetrol*this.numberofgears);
			}
			
			@Override
			public String toString() {
				return " Car\nEngine capacity = "+this.enginecapacity+"\t Quantity of petrol = "+this.quantityofpetrol+" \tNumber of gears = "+this.numberofgears;
			}
		}

		class Bicycle implements CarbonFootPrint{
			double tyres;  
			double greeze;
			
			
			public Bicycle() {
				
			}
			public Bicycle(double tyres,double greeze) {
				this.tyres=tyres;
				this.greeze=greeze;
			}
			

			public Double getCarbonFootPrint() {
				return (tyres*greeze);
			}
			@Override
			public String toString() {
				return " Bicycle:\nTyres burden:  = "+this.tyres+"\t greeze applied: = "+this.greeze;
			}
		}

/*
 *  Building
Height = 50.8 	width = 70.3 	house Story = 60.888
CarbonFoot Print it Releases is: 217445.66111999998

 Car
Engine capacity = 20.0	 Quantity of petrol = 30.0 	Number of gears = 40.8
CarbonFoot Print it Releases is: 24480.0

 Bicycle:
Tyres burden:  = 2.0	 greeze applied: = 12.0
CarbonFoot Print it Releases is: 24.0*/
 