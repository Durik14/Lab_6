package Lab_6;


public class GreenTicket6 implements NewYear {

    public GreenTicket5 greenTicket5;

    public GreenTicket6(GreenTicket5 greenTicket5) {
        this.greenTicket5 = greenTicket5;
    }


    @Override
    public void newYear(double time) {
        System.out.println("Можна отримати  " + time + " кращих країн для навчання !");
    }
}
