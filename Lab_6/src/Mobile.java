package Lab_p;



public class Mobile6 implements NewYear {

    public Mobile4 mobile4;

    public Mobile6(Mobile4 mobile4) {
        this.mobile4 = mobile4;
    }


    @Override
    public void newYear(double time) {
        if (time < 12  && time > 5) {
            System.out.println("Вітаю ви отримали,знижку на смартфон 50%");
        }
    }
}
