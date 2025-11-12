import java.util.Arrays;
import java.util.Comparator;

public class NPCSort {
    public static void main(String[] args) {
        // Створюємо масив NPC
        NPC[] npcs = {
            new NPC("Gandalf", 50, 100, 70, "Mage"),
            new NPC("Boromir", 40, 120, 60, "Warrior"),
            new NPC("Frodo", 20, 80, 25, "Adventurer"),
            new NPC("Aragorn", 45, 110, 65, "Ranger"),
            new NPC("Legolas", 42, 90, 80, "Archer")
        };

        System.out.println("=== Початковий список NPC ===");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // 🔹 Сортування за рівнем (level) — за зростанням
        Arrays.sort(npcs, Comparator.comparingInt(n -> n.level));

        System.out.println("\n=== Сортування за рівнем (за зростанням) ===");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // 🔹 Сортування за шкодою (damage) — за спаданням
        Arrays.sort(npcs, Comparator.comparingInt((NPC n) -> n.damage).reversed());

        System.out.println("\n=== Сортування за шкодою (за спаданням) ===");
        for (NPC npc : npcs) {
            System.out.println(npc);
        }

        // 🔹 Заданий об’єкт для пошуку
        NPC target = new NPC("Aragorn", 45, 110, 65, "Ranger");

        // 🔹 Пошук ідентичного об’єкта
        boolean found = false;
        for (NPC npc : npcs) {
            if (npc.equals(target)) {
                System.out.println("\nЗнайдено ідентичного NPC: " + npc);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n❌ Ідентичного NPC не знайдено.");
        }
    }
}