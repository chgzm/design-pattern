public class Hero {
    private int level = 1;
    private int hp    = 10;

    public void levelUp() {
        ++(this.level);
    }

    public void receiveDamage(int point) {
        this.hp -= point;
    }

    public void healDamange(int point) {
        this.hp += point;
    }

    public Memento createMemento() {
        return new Memento(this.level, this.hp);
    }
    
    public void restoreMemento(Memento memento) {
        this.level = memento.getLevel();
        this.hp    = memento.getHP();
    }

    @Override
    public String toString() {
        return String.format("Level=%d,HP=%d", this.level, this.hp);
    }

    public static class Memento {
        private final int level;
        private final int hp;

        public Memento(int level, int hp) {
            this.level = level;
            this.hp    = hp;
        }

        private int getLevel() {
            return this.level;
        }

        private int getHP() {
            return this.hp;
        }
    } 
}

