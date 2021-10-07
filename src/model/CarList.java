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
    public CarList(){
        this.carList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
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
