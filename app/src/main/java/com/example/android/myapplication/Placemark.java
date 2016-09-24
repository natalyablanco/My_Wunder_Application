
package com.example.android.myapplication;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Placemark {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("coordinates")
    @Expose
    private List<Double> coordinates = new ArrayList<Double>();
    @SerializedName("engineType")
    @Expose
    private String engineType;
    @SerializedName("exterior")
    @Expose
    private String exterior;
    @SerializedName("fuel")
    @Expose
    private Integer fuel;
    @SerializedName("interior")
    @Expose
    private String interior;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("vin")
    @Expose
    private String vin;

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    public List<Double> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * 
     * @param engineType
     *     The engineType
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * 
     * @return
     *     The exterior
     */
    public String getExterior() {
        return exterior;
    }

    /**
     * 
     * @param exterior
     *     The exterior
     */
    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    /**
     * 
     * @return
     *     The fuel
     */
    public Integer getFuel() {
        return fuel;
    }

    /**
     * 
     * @param fuel
     *     The fuel
     */
    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    /**
     * 
     * @return
     *     The interior
     */
    public String getInterior() {
        return interior;
    }

    /**
     * 
     * @param interior
     *     The interior
     */
    public void setInterior(String interior) {
        this.interior = interior;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * 
     * @param vin
     *     The vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

}
