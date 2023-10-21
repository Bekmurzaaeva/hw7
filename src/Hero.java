
// Создаем абстрактный класс Hero, который реализует интерфейс HavingSuperAbility
public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    // Конструктор для инициализации полей
    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    // Геттеры и сеттеры для полей
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    // Реализация метода из интерфейса HavingSuperAbility
    @Override
    public void applySuperAbility() {
        System.out.println("Применена суперспособность: " + this.superAbilityType);
    }
}
