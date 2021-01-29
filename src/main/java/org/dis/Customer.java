package org.dis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String ip_from;

    private String ip_to;

    private String country_code;

    private String country_name;

    private String region_name;

    private String city_name;

    private String latitude;

    private String longitude;

    private String zip_code;

    private String time_zone;

    protected Customer() {
    }

    public Customer(String ip_from, String ip_to, String country_code, String country_name,
                    String region_name, String city_name, String latitude, String longitude,
                    String zip_code, String time_zone) {

        this.ip_from = ip_from;
        this.ip_to = ip_to;
        this.country_code = country_code;
        this.country_name = country_name;
        this.region_name = region_name;
        this.city_name = city_name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zip_code = zip_code;
        this.time_zone = time_zone;
    }

    public Long getId() {
        return id;
    }

    public String getIP() {
        return ip_from;
    }

    public void setIP(String ip_from) {
        this.ip_from = ip_from;
    }

    public String getIPTO() {
        return ip_to;
    }

    public void setIPTO(String ip_to) {
        this.ip_to = ip_to;
    }

    public String getcountry_code() {
        return country_code;
    }

    public void setcountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getcountry_name() {
        return country_name;
    }

    public void setcountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getregion_name() {
        return region_name;
    }

    public void setregion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getcity_name() {
        return city_name;
    }

    public void setcity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getlatitude() {
        return latitude;
    }

    public void setlatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getlongitude() {
        return longitude;
    }

    public void setlongitude(String longitude) { this.longitude = longitude; }

    public String getCode() {
        return zip_code;
    }

    public void setCode(String zip_code) {
        this.zip_code = zip_code;
    }

    public String gettime_zone() {
        return time_zone;
    }

    public void settime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, ip_from='%s', ip_to='%s', country_code='%s', region_name='%s', city_name='%s', latitude='%s'" +
                        "longitude='%s', zip_code='%s', time_zone='%s']", id, ip_from, ip_to, country_code, country_name
                , region_name, city_name, latitude, longitude, zip_code, time_zone);
    }

}