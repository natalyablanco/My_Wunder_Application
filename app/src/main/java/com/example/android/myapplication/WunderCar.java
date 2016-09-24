
package com.example.android.myapplication;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WunderCar {

    @SerializedName("placemarks")
    @Expose
    private List<Placemark> placemarks = new ArrayList<Placemark>();

    /**
     * 
     * @return
     *     The placemarks
     */
    public List<Placemark> getPlacemarks() {
        return placemarks;
    }

    /**
     * 
     * @param placemarks
     *     The placemarks
     */
    public void setPlacemarks(List<Placemark> placemarks) {
        this.placemarks = placemarks;
    }

}
