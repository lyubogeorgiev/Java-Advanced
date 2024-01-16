import java.util.*;

public class Ex11LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junkMaterials = new TreeMap<>();

        boolean isOver = false;

        while (!isOver){
            String[] inputTokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < inputTokens.length; i += 2) {
                int points = Integer.parseInt(inputTokens[i]);
                String material = inputTokens[i + 1].toLowerCase();

                if (material.equalsIgnoreCase("motes")
                        || material.equalsIgnoreCase("fragments")
                        || material.equalsIgnoreCase("shards")){

                    keyMaterials.put(material, keyMaterials.get(material) + points);


                    if (keyMaterials.get(material) >= 250){
                        String levelObtained = "";

                        switch (material){
                            case "shards":
                                levelObtained = "Shadowmourne";
                                keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                                break;
                            case "fragments":
                                levelObtained = "Valanyr";
                                keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                                break;
                            case "motes":
                                levelObtained = "Dragonwrath";
                                keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                                break;
                        }

                        System.out.printf("%s obtained!%n", levelObtained);
                        printMaterials(keyMaterials, junkMaterials);
                        isOver = true;
                        break;
                    }
                } else {
                    junkMaterials.putIfAbsent(material, 0);
                    junkMaterials.put(material, junkMaterials.get(material) + points);
                }
            }
        }
    }

    private static void printMaterials(Map<String, Integer> keyMaterials, Map<String, Integer> junkMaterials) {
        List<Map.Entry<String, Integer>> orderedListKeyMaterials = new ArrayList<>(keyMaterials.entrySet());

        orderedListKeyMaterials.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue());
            return valueComparison != 0 ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
        });


        for (Map.Entry<String, Integer> keyMaterial : orderedListKeyMaterials) {
            System.out.printf("%s: %d%n", keyMaterial.getKey(), keyMaterial.getValue());
        }

        for (Map.Entry<String, Integer> junkMaterial : junkMaterials.entrySet()) {
            System.out.printf("%s: %d%n", junkMaterial.getKey(), junkMaterial.getValue());
        }
    }
}
