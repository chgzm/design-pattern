public class Main {
    public static void main(String[] args) {
        final Hero hero = new Hero();
        final Hero.Memento memento = hero.createMemento();
        
        hero.levelUp();
        hero.receiveDamage(3);
        System.out.println(hero);

        hero.restoreMemento(memento);
        System.out.println(hero);
    }        
}
