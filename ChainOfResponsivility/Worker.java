public abstract class Worker {
    private final String   name;
    private final Worker boss;

    public Worker(String name, Worker boss) {
        this.name = name;
        this.boss = boss;
    }

    public abstract boolean decide(int price);

    public void execute(Product product) {
        if (true == this.decide(product.price)) {
            System.out.printf("%s ($%d) is bought by %s.\n", product.name, product.price, this.name);
        } else {
            this.boss.execute(product);
        }
    }
}
