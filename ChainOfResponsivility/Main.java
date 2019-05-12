public class Main {
    public static void main(String[] args) {
        final Worker bob    = new President("Bob",  null);
        final Worker angela = new Manager("Angela", bob);
        final Worker mike   = new Staff("Mike", angela); 

        mike.execute(new Product("Stationery", 1000));
        mike.execute(new Product("PC",         200000));
        mike.execute(new Product("Car",        3000000));
    } 
}
