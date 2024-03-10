/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
  @Override
  public String toString() {
    // this.getClass().getSimpleName() -> prints this class name
    // this.getClass().getSuperclass().getSimpleName() -> prints this super class name
    String val = "-Animal:\t" + this.getClass().getSimpleName() + "\n";
    val += "-Type:\t\t" + this.getClass().getSuperclass().getSimpleName() + "\n";
    val += "-Noise:\t" + this.noise() + "\n";  val += "-Age:\t\t" + this.getAge() + "\n";
    val += "-Can fly:\t" + this.canFly();
    return val;
  }
}
