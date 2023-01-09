package api.pojo;

import java.util.ArrayList;

public class Location {
    public int geoname_id;
    public String capital;
    public ArrayList<Pojo.Language> languages;
    public String country_flag;
    public String country_flag_emoji;
    public String country_flag_emoji_unicode;
    public String calling_code;
    public Boolean is_eu;

    public Location(int geoname_id, String capital, ArrayList<Pojo.Language> languages, String country_flag, String country_flag_emoji, String country_flag_emoji_unicode, String calling_code, Boolean is_eu) {
        this.geoname_id = geoname_id;
        this.capital = capital;
        this.languages = languages;
        this.country_flag = country_flag;
        this.country_flag_emoji = country_flag_emoji;
        this.country_flag_emoji_unicode = country_flag_emoji_unicode;
        this.calling_code = calling_code;
        this.is_eu = is_eu;
    }

    public int getGeoname_id() {
        return geoname_id;
    }

    public String getCapital() {
        return capital;
    }

    public ArrayList<Pojo.Language> getLanguages() {
        return languages;
    }

    public String getCountry_flag() {
        return country_flag;
    }

    public String getCountry_flag_emoji() {
        return country_flag_emoji;
    }

    public String getCountry_flag_emoji_unicode() {
        return country_flag_emoji_unicode;
    }

    public String getCalling_code() {
        return calling_code;
    }

    public Boolean getIs_eu() {
        return is_eu;
    }
}
