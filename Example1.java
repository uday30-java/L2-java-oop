abstract class dog {
    abstract void type();
}

class Goldenretriver extends dog{
    void type(){
        System.out.println("It's not a guard dog");
    }
}
class Germanshephard extends dog{
    void type(){
        System.out.println("It's a watch dog");
    }
}
public class Example1{
    public static void main(String[] args) {
        dog A = new Goldenretriver();
        A.type();

        dog B = new Germanshephard();
        B.type(); 
    }
}

   

    

    

