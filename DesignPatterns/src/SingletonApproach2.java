/* In this approach, we will make createInstance method synchronized so only one thread is allowed in that class
 and only one object will be created instead of Two.
 */
public class SingletonApproach2 {

    /*
     * This variable will be used to hold reference of JBT class.
     */
    private static SingletonApproach2 instance = null;
    /*
     * As private constructor is used so can not create object of this class
     * directly. Except by using static method of same class.
     */
    private SingletonApproach2() {
    }
    /*
     * This method will be used to get instance of JBT class. This method will
     * check if there is aready an object of class create or not if not then it
     * will create an Obect of JBT class and return the same else it will return
     * the existing Object.
     *
     * Now method is marked as synchronized hence only one threa will be allowed
     * to enter in this method hence only one object will be created.
     */
    static synchronized SingletonApproach2 createInstance() {
        if (instance == null){
            instance = new SingletonApproach2();
            return instance;
        }
        else
            return instance;
    }
    int i;
}
