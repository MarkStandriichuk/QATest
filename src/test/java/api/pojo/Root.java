package api.pojo;

public class Root {
    private String ip;
    private String type;
    private String continent_code;
    private String continent_name;
    private String country_code;
    private String country_name;
    private String region_code;
    private String region_name;
    private String city;
    private String zip;
    private Double latitude;
    private Double longitude;
    private Pojo.Location location;

    public Root() {
        super();
    }

    public Root(String ip, String type, String continent_code, String continent_name, String country_code, String country_name, String region_code, String region_name, String city, String zip, Double latitude, Double longitude, Pojo.Location location) {
        this.ip = ip;
        this.type = type;
        this.continent_code = continent_code;
        this.continent_name = continent_name;
        this.country_code = country_code;
        this.country_name = country_name;
        this.region_code = region_code;
        this.region_name = region_name;
        this.city = city;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
    }

    public String getIp() {
        return ip;
    }

    public String getType() {
        return type;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Pojo.Location getLocation() {
        return location;
    }
}
