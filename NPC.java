import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Клас NPC (неігровий персонаж)
 * Містить поля, що описують базові характеристики персонажа
 */
class NPC {
    String name;      // Ім’я персонажа
    int level;        // Рівень
    int health;       // Кількість здоров’я
    int damage;       // Сила атаки
    String role;      // Роль (наприклад: торговець, воїн, маг)

    // Конструктор для ініціалізації полів
    public NPC(String name, int level, int health, int damage, String role) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.role = role;
    }

    // Метод для зручного виведення інформації про NPC
    @Override
    public String toString() {
        return String.format("NPC{name='%s', level=%d, health=%d, damage=%d, role='%s'}", name, level, health, damage, role);
    }

    // Перевизначення equals() для порівняння NPC
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NPC)) return false;
        NPC npc = (NPC) o;
        return level == npc.level &&
            health == npc.health &&
            damage == npc.damage &&
            Objects.equals(name, npc.name) &&
            Objects.equals(role, npc.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, health, damage, role);
    }
}