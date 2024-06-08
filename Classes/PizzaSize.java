package Package18.Classes;

public enum PizzaSize {
    Mini(2),Medium(5),Large(10);
    public final int value;     // chon final hast pas faghat yek bar mishe value dad behesh
    PizzaSize(int value) {
        this.value = value;
    }
}
