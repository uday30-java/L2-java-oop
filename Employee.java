class Employee {
    private int id;
    private String name;

    public void setDetails(int i, String n) {
        id = i;
        name = n;
    }
        public void getDetails() {
        System.out.println("ID : " + id + " Name : " + name);
    }
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setDetails(101, "Kumar");
        E1.getDetails();

        Employee E2 = new Employee();
        E2.setDetails(102, "Rahul");
        E2.getDetails();
    }
}
