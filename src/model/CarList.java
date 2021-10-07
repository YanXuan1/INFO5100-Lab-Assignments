/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dellpc
 */
public class CarList {
    private ArrayList<Car> carList;
    private ArrayList<String> serialList;
    public CarList(){
        this.carList = new ArrayList<Car>();
        this.serialList = new ArrayList<String>();
        
        Car car1 = new Car();
        car1.setBrand("Ford");
        car1.setBuildDate("1996/02/02");
        car1.setCity("Boston");
        car1.setIsOutdated(true);
        car1.setIsUseble(true);
        car1.setManufacturer("Ford");
        car1.setModelNumber("F-150");
        car1.setSeats(4);
        car1.setSerialNumber("798AB456AA2ML1786");
        carList.add(car1);
        
        Car car2 = new Car();
        car2.setBrand("Ford");
        car2.setBuildDate("2006/02/02");
        car2.setCity("Boston");
        car2.setIsOutdated(true);
        car2.setIsUseble(false);
        car2.setManufacturer("Ford");
        car2.setModelNumber("Fox");
        car2.setSeats(5);
        car2.setSerialNumber("1111111111AAAAAAA");
        carList.add(car2);
        
        Car car3 = new Car();
        car3.setBrand("Ford");
        car3.setBuildDate("2012/02/02");
        car3.setCity("NewYork");
        car3.setIsOutdated(false);
        car3.setIsUseble(false);
        car3.setManufacturer("Ford");
        car3.setModelNumber("Explorer");
        car3.setSeats(5);
        car3.setSerialNumber("2222222222AAAAAAA");
        carList.add(car3);
        
        Car car4 = new Car();
        car4.setBrand("FAW-Audi");
        car4.setBuildDate("2020/02/02");
        car4.setCity("Boston");
        car4.setIsOutdated(true);
        car4.setIsUseble(true);
        car4.setManufacturer("FAW");
        car4.setModelNumber("A6");
        car4.setSeats(6);
        car4.setSerialNumber("3333333333AAAAAAA");
        carList.add(car4);
        
        Car car5 = new Car();
        car5.setBrand("FAW-Audi");
        car5.setBuildDate("2020/02/02");
        car5.setCity("Boston");
        car5.setIsOutdated(false);
        car5.setIsUseble(true);
        car5.setManufacturer("FAW");
        car5.setModelNumber("A8");
        car5.setSeats(4);
        car5.setSerialNumber("3222222222AAAAAAA");
        carList.add(car5);
        
        Car car6 = new Car();
        car6.setBrand("FAW-Toyota");
        car6.setBuildDate("2008/02/02");
        car6.setCity("Chicago");
        car6.setIsOutdated(true);
        car6.setIsUseble(true);
        car6.setManufacturer("FAW");
        car6.setModelNumber("Toyota");
        car6.setSeats(6);
        car6.setSerialNumber("3555222222AAAAAAA");
        carList.add(car6);
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public boolean isOnlySN(String str){
        //for(Car car : carList){
            if(serialList.contains(str)){
                return false;
            }
        //}
        return true;
    }

    public ArrayList<String> getSerialList() {
        return serialList;
    }

    public void setSerialList(ArrayList<String> serialList) {
        this.serialList = serialList;
    }
    
    public ArrayList<String> deleteSN(String str){
        serialList.remove(str);
        return serialList;
    }
    
    public ArrayList<String> addSN(String str){
        serialList.add(str);
        return serialList;
    }
    
    public ArrayList<Car> searchByBrand(String brand){
        ArrayList<Car> brands = new ArrayList<Car>();
        for(Car item : carList){
            if(item.getBrand().equals(brand)){
                brands.add(item);
            }
        }
        return brands;
    }
    
    public ArrayList<Car> searchByYear(String date){
        ArrayList<Car> year = new ArrayList<Car>();
        for(Car item : carList){
            if(item.getBuildDate().substring(0, 4).equals(date)){
                year.add(item);
            }
        }
        return year;
    }
    
    public ArrayList<Car> searchBySeats(int x, int y){
        ArrayList<Car> seats = new ArrayList<Car>();
        for(Car item : carList){
            if((item.getSeats() <= y) && (item.getSeats() >= x)){
                seats.add(item);
            }
        }
        return seats;
    }
    
    public Car searchBySerialNumber(String serialNumber){
        for(Car item : carList){
            if(item.getSerialNumber().equals(serialNumber)){
                return item;
            }
        }
        return null;
    }
    
    public ArrayList<Car> searchByManufacturer(){
        ArrayList<Car> manufacturer = new ArrayList<Car>();
        for(Car item : carList){
            if(!manufacturer.contains(item.getManufacturer())){
                manufacturer.add(item);
            }
        }
        return manufacturer;
    }
    
    public ArrayList<Car> searchByCity(String city){
        ArrayList<Car> location = new ArrayList<Car>();
        for(Car item : carList){
            if(item.getCity().equals(city)){
                location.add(item);
            }
        }
        return location;
    }
    
    public ArrayList<Car> searchByOutdated(){
        ArrayList<Car> dated = new ArrayList<Car>();
        for(Car item : carList){
            if(item.isIsOutdated() == true){
                dated.add(item);
            }
        }
        return dated;
    }
    
    public ArrayList<Car> searchByNotOutdated(){
        ArrayList<Car> notdated = new ArrayList<Car>();
        for(Car item : carList){
            if(item.isIsOutdated() == false){
                notdated.add(item);
            }
        }
        return notdated;
    }
    
    public ArrayList<Car> searchByUseble(){
        ArrayList<Car> useble = new ArrayList<Car>();
        for(Car item : carList){
            if(item.isIsUseble() == true){
                useble.add(item);
            }
        }
        return useble;
    }
    
    public ArrayList<Car> searchByUnuseble(){
        ArrayList<Car> unUseble = new ArrayList<Car>();
        for(Car item : carList){
            if(item.isIsUseble() == false){
                unUseble.add(item);
            }
        }
        return unUseble;
    }
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public void deleteCar(Car car){
        carList.remove(car);
    }
    
    public Car getItem(int i){
        return carList.get(i);
    }
    
    public ArrayList<String> findBrands(){
        ArrayList<String> brands = new ArrayList<String>();
        for(Car car : carList){
            if(!brands.contains(car.getBrand())){
                brands.add(car.getBrand());
            }
        }
        return brands;
    }
    
    public ArrayList<String> findYear(){
        ArrayList<String> year = new ArrayList<String>();
        for(Car car : carList){
            if(!year.contains(car.getBuildDate().substring(0, 4))){
                year.add(car.getBuildDate().substring(0, 4));
            }
        }
        return year;
    }
    
    public ArrayList<Car> findModelNumber(String modelNumber){
        ArrayList<Car> model = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getModelNumber().equals(modelNumber)){
                model.add(car);
            }
        }
        return model;
    }
    
    public ArrayList<String> findManu(){
        ArrayList<String> manu = new ArrayList<String>();
        for(Car car : carList){
            if(!manu.contains(car.getManufacturer())){
                manu.add(car.getManufacturer());
            }
        }
        return manu;
    }
    
    
    
}
