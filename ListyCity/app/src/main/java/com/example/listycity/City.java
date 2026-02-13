package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * City Constructor
     * @param city
     * city name
     * @param province
     * city province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * City Name getter
     * @return
     * return city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * City province getter
     * @return
     * return city province
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Compares Cities
     * @param o
     * City to compare to
     * @return
     * return whether the city compare is higher or lower
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
