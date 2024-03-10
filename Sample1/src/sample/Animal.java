package sample;
public abstract class Animal {
  protected int age;
  protected abstract String noise();
  protected abstract boolean canFly();
  public Animal(int age) {
    this.age = age;
  }
  protected int getAge() {
    return age;
  }
  

}
