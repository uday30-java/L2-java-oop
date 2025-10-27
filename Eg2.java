class Eg2 {
    static void mystaticmethod(){
        System.out.println("static method");
    }
    public void mypublicmethod(){
        System.out.println("public method");
    }
    public static void main(String[] args) {
        mystaticmethod();
        Eg2 answer = new Eg2();
        answer.mypublicmethod();
    }
    
}
