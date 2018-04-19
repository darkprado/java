public class Worker {

    private String name, position, email;
    private int age, salary;
    private long tel;

    public Worker (String name, String position, String email, long tel, int age, int salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.age = age;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public String getPosition () {
        return position;
    }

    public String getEmail () {
        return email;
    }

    public long getTel () {
        return tel;
    }

    public int getSalary () {
        return salary;
    }

    public int getAge () {
        return age;
    }

    public void print () {
        System.out.println("Сотрудник: имя - " + getName() + ", должность - " + getPosition() + ", email - " + getEmail() +
                ", телефон - " + getTel() + ", возраст - " + getAge() + ", зарплата - " + getSalary());
    }

}
