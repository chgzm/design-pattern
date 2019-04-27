import java.util.Map;
import java.util.HashMap;

public class MonsterManager {
    private final Map<String, Monster> monsterMap = new HashMap<>();

    public void addPrototype(String name, Monster monster) {
        this.monsterMap.put(name, monster);
    }

    public Monster createMonster(String name) throws CloneNotSupportedException {
        final Monster monster = this.monsterMap.get(name);
        if (monster == null) {
            throw new IllegalArgumentException("Inavlid monster name");
        }

        return monster.createClone();
    }
}
