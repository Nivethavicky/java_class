package javaproject;

public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				class Superclass 
				{
				    int num = 10;
				    void display()
				    {
				        System.out.println("Superclass method");
				    }
				}

				class Subclass extends Superclass {
				        void display()
				        {
				        super.display(); // Call superclass method
				        System.out.println("Subclass method");
				        }

//				    void accessSuperclassField()
//				    {
//				        System.out.println("Value of superclass field: " + super.num); // Access superclass field
//				    }
//				}
		//
			}
		   }

	}


