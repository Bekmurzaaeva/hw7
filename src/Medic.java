// Создаем класс Medic, наследуемый от Hero
public class Medic extends Hero {
    // Конструктор, вызывает конструктор родительского класса
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    // Переопределение метода applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
    }
}