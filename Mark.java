 class Mark {
    String name;
    int english;
    int maths;
    int science;

    Mark(){
        name = "rahul";
        english = 80;
        maths = 49;
        science = 74;
    }
    Mark(String n,int eng,int math,int sci){
        name = n;
        english = eng;
        maths = math;
        science = sci;
    }
    Mark(int eng, int math, int sci){
        name = "uday";
        english = eng;
        maths = math;
        science = sci;
    }
    void display(){
        System.out.println("Name = "+name +"eng mark = "+english+"math mark = "+maths+"Sci mark = "+science);
    }

    
    public static void main(String[] args) {
        Mark mark1 = new Mark();
        mark1.display();
        Mark mark2 = new Mark("kumar",90,81,7);
        mark2.display();
        Mark mark3 = new Mark(66,78,92);
        mark3.display();
    }
}
