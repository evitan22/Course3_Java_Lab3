import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class NPCSort {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        // Створюється масив NPC
        NPC[] npcs = {
            new NPC("Gandalf", 50, 100, 70, "Mage"),
            new NPC("Boromir", 40, 120, 60, "Warrior"),
            new NPC("Frodo", 20, 80, 25, "Adventurer"),
            new NPC("Aragorn", 45, 110, 65, "Ranger"),
            new NPC("Legolas", 42, 90, 80, "Archer")
        };

        System.out.println("Initial NPC list: ");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // Сортування за level — за зростанням
        Arrays.sort(npcs, Comparator.comparingInt(n -> n.level));

        System.out.println("\nSort by ascending: ");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // Сортування за damage — за спаданням
        Arrays.sort(npcs, Comparator.comparingInt((NPC n) -> n.damage).reversed());

        System.out.println("\nSort by descending: ");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // Заданий об’єкт для пошуку
        NPC target = new NPC("Aragorn", 45, 110, 65, "Ranger");

        // Пошук ідентичного об’єкта
        boolean found = false;
        for (NPC npc : npcs) {
            if (npc.equals(target)) {
                System.out.println("\nIdentical NPC found: " + npc);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo identical NPC found.");
        }
    }
}