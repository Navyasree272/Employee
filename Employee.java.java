 public class Employee{
    public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
     int wageperhour=20;
     int fulldayhour=8;
     int parttimehour=4;
     int workingday=20;
     int maxhours=100;
     int maxdays=20;
     int count1=0;
     int count2=0;
     int Employeewage=1;
       while( count1<maxhours || count2<maxdays )      
         {
        int check=(int)Math.floor(Math.random() *10) % 3;
             switch(check){
              case 1:
                  //Employee is full time
                  Employeewage=wageperhour *fulldayhour * workingday;
                    count1 +=8;
                    count2 +=1;
                 break;
              case 2:
                   //"Employee is part time
                  Employeewage=wageperhour * parttimehour* workingday;
                count1 +=4;
                count2 +=1;
                   break;
   
               default:
             //  Employee is absent 
                 count1+=0;
                 count2+=0;
           }
}
 System.out.println("wage  of the Employee according to shifts is"+ Employeewage); 

}
}
























































































































































































































































































































