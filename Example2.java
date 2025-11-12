abstract class Teacher {

    String name;
    String subject;

    Teacher(String name,String subject){
        this.name = name;
        this.subject = subject;
    }

    abstract void teach();

    void display(){
        System.out.println("Teacher name :"+ name +"sub :"+ subject);
    }
}

    class Mathteacher extends Teacher{
        Mathteacher(String name, String subject){
            super(name,subject);
        }
        void teach(){
            System.out.println("Teaches Algebra and Trigonometry");
        }

    }

    class Englishteacher extends Teacher{
        Englishteacher(String name,String subject){
            super(name, subject);
        }
        void teach(){
            System.out.println("Teaches Literature and Grammer");
        }
    }

    public class Example2 {
        public static void main(String[] args) {
           Teacher T1 =  new Mathteacher("Ravi", "Maths");
           T1.display();
           T1.teach();
           
           Teacher T2 = new Englishteacher("Kumar", "English");
           T2.display();
           T2.teach();

        }
    }

    

