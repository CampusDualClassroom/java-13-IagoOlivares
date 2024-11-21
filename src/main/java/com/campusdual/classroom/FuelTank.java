package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 0;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("No se admiten valores negativos");
    } else {
      this.actualFuel += fuel;
    }

  }
}
