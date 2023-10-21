public class Magic extends Hero {
    // Конструктор, вызывает конструктор родительского класса
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    // Переопределение метода applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC ATTACK");
    }

