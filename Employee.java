 public class Employee{
    public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
     int isfulltime=1;
     int wageperhour=20;
     int fulldayhour=8;
     int parttimehour=4;
     int workingday=20;
          double empcheck=Math.floor(Math.random() *10) % 2;
        if (empcheck == isfulltime) 
        {  
	    System.out.println(" Employee is present ");
        int check=(int)Math.floor(Math.random() *10) % 2;
             switch(check){
              case 1:
                  System.out.println("Employee is full time");
                  System.out.println("Employee wage" + wageperhour *fulldayhour * workingday);
                 break;    
              default:
                   System.out.println("Employee is part time");
                  System.out.println("Employee wage" + wageperhour * parttimehour* workingday);
                 break;
                  }
                 }
       else {
       System.out.println(" Employee is absent ");
	
	}
 }
}
