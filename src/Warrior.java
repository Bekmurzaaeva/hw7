public class Warrior extends Hero {
    // Конструктор, вызывает конструктор родительского класса
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    // Переопределение метода applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
