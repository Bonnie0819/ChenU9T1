public class Bus extends Vehicle{
    private int people;
    public Bus(String name, int wheels, int people) {
        super(name, wheels);
        this.people = people;
    }
    public int getPeople() {
        return people;
    }
    public void openDoors() {
        System.out.println("Get on! The doors are open!");
    }

}
