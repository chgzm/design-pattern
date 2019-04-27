public class Main {
    public static void main(String[] args) {
        final MonsterManager manager = new MonsterManager();
        manager.addPrototype("NormalSlime", new Slime("Normal")); 
        manager.addPrototype("MetalSlime",  new Slime("Metal")); 
        manager.addPrototype("KingSlime",   new Slime("King")); 

        try {
            for (int i = 0; i < 3; ++i) {
                final Monster normalSlime = manager.createMonster("NormalSlime");
                final Monster metalSlime  = manager.createMonster("MetalSlime");
                final Monster kingSlime   = manager.createMonster("KingSlime");

                System.out.printf("Name=%-12s,Instance=0x%x\n", normalSlime, normalSlime.hashCode());
                System.out.printf("Name=%-12s,Instance=0x%x\n", metalSlime,  metalSlime.hashCode());
                System.out.printf("Name=%-12s,Instance=0x%x\n", kingSlime,   kingSlime.hashCode());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
