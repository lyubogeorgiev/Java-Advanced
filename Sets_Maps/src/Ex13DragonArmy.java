import java.util.*;

public class Ex13DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<Integer>>> dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String type = inputTokens[0];
            String name = inputTokens[1];

            int damage = 45;
            if (!inputTokens[2].equals("null")){

                damage = Integer.parseInt(inputTokens[2]);
            }

            int health = 250;
            if (!inputTokens[3].equals("null")){

                health = Integer.parseInt(inputTokens[3]);
            }

            int armor = 10;
            if(!inputTokens[4].equals("null")){

                armor = Integer.parseInt(inputTokens[4]);
            }

            dragons.putIfAbsent(type, new TreeMap<>());

            dragons.get(type).putIfAbsent(name, new ArrayList<>());

            if (!dragons.get(type).get(name).isEmpty()){
                dragons.get(type).get(name).set(0, damage);
                dragons.get(type).get(name).set(1, health);
                dragons.get(type).get(name).set(2, armor);
            } else {

                dragons.get(type).get(name).add(damage);
                dragons.get(type).get(name).add(health);
                dragons.get(type).get(name).add(armor);
            }


        }

        for (Map.Entry<String, Map<String, List<Integer>>> dragon : dragons.entrySet()) {
            //calculate avg stats for each dragon
            int sumDamage = 0;
            int sumHealth = 0;
            int sumArmor = 0;

            for (Map.Entry<String, List<Integer>> currentDragon : dragon.getValue().entrySet()) {
                sumDamage += currentDragon.getValue().get(0);
                sumHealth += currentDragon.getValue().get(1);
                sumArmor += currentDragon.getValue().get(2);
            }

            int size = dragon.getValue().size();

            double avgDamage = (double) sumDamage / size;
            double avgHealth = (double) sumHealth / size;
            double avgArmor = (double) sumArmor / size;

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", dragon.getKey(), avgDamage, avgHealth, avgArmor);

            for (Map.Entry<String, List<Integer>> currentDragon : dragon.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        currentDragon.getKey(),
                        currentDragon.getValue().get(0),
                        currentDragon.getValue().get(1),
                        currentDragon.getValue().get(2));
            }
        }
    }
}
