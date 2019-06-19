/*In this approach,  we will create private constructor and also a static method to create an object of same class. */
public class SingletonApproach1 {

    //This variable will be used to hole reference of SingletonApproach1 class
   private static SingletonApproach1 instance=null;

   //to test singleton behaviour of class.
   int a;

   //As private constructor is used so cannot create object of this class directly.
   // Except static method of same class.
   private SingletonApproach1(){}

   /*
   *  This method will be used to create instance of SingletonApproach1 class.
   *  This method will check if there is already an object of this class create or not then it will create
   * an object for this class and return the same else it will return existing object.
    */

   public static SingletonApproach1 getInstance(){
       if(instance==null){
           instance=new SingletonApproach1();
           return instance;
       }else{
           return instance;
       }
    }

    public static void main(String[] args) {
        SingletonApproach1 instance=SingletonApproach1.getInstance();
        instance.a=10;
        SingletonApproach1 instance1=SingletonApproach1.getInstance();
        instance1.a=20;
        System.out.println(instance.a);

        System.out.println(instance1.a);

    }

    /* What will happen if 2 different threads enters the getInstance method at the same time when the
       instance is null in this case threads will create 2 different objects of SingletonApproach1 class
       Which is against to the singleton pattern, in the next approach, this problem can be solved.*/
}
