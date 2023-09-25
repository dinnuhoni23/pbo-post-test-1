/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import com.mycompany.posttest1.Car;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Posttest1 {

    public static void main(String[] args) {
        Car car1 = new Car("Lexus", "LC 500", 2023, 1500000000);
        Car car2 = new Car("Lexus", "LS 500", 2023, 1800000000);
        Car car3 = new Car("Lexus", "RX 500", 2023, 2000000000);
        Car car4 = new Car("Lexus", "LM 4ST", 2023, 1900000000);
        Car car5 = new Car("Lexus", "LX 600", 2023, 2100000000);
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        
        for (Car car : cars) {
            String carBrand = "Brand " + car.brand;
            String carModel = " Model " + car.model;
            String carYear = " tahun " + car.year;
            String carPrice = " harga " + car.price;
            System.out.println(carBrand.concat(" memiliki" + carModel + " keluaran" +  carYear + " dengan" + carPrice));
         }
    }
}
