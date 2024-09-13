public class Gold extends Member {
    public Gold(String name, double purchase) {
        super(name, purchase);
    }

    @Override
    public double cal() {
        if (getPurchase() >= 1500) {
            return getPurchase() * .03d;
        }
        return 0;
    }
}
