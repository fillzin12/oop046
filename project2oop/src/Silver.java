public class Silver extends Member{
    public Silver(String name, double purchase) {
        super(name, purchase);
    }

    @Override
    public double cal() {
        if (getPurchase() >= 1000) {
            return getPurchase() * .02d;
        }
        return 0;
    }
}
