public class Main {
    public static void main(String[] args) {
        // Создаем массив из трех разных героев
        Hero[] heroes = {
                new Magic(100, 20, "Fireball"),
                new Medic(80, 10, "Healing Hands"),
                new Warrior(120, 30, "Sword Strike")
        };

        // Применяем суперспособность каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}