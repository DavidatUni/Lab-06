package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns whether a city is in the list
     * @param city
     * City to be searched for
     * @return
     * Return True or False if city is in list or not
     */
    public boolean hasCity(City city) {
        List<City> list = cities;
        Collections.sort(list);
        Comparator<City> c = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getCityName().compareTo(o2.getCityName());
            }
        };
        int index = Collections.binarySearch(list, city, c);
        return index > -1;
    }

    /**
     * Deletes a city from the list
     * @param city
     * City to be deleted if it doesn't exist errors
     */
    public void deleteCity(City city) {
        List<City> list = cities;
        if (hasCity(city)) {
            list.remove(city);
        } else {
            throw new IllegalArgumentException();
        }

    }

    /**
     * Counts total Cities in list
     * @return
     * Returns total amount of cities in the list
     */
    public int countCities() {
        List<City> list = cities;
        return list.size();
    }
}

