package controllers;

import models.Car;

public class CarController {
  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < cars.length; j++) {
        if (cars[j].getName().compareToIgnoreCase(cars[min].getName()) < 0) {
          min = j;
        }
        Car aux = cars[min];
        cars[min] = cars[i];
        cars[i] = aux;
      }
    }
  }
}
