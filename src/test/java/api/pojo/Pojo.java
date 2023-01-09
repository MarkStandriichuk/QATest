package api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Pojo {
    public static class Language{
        public String code;
        public String name;
        @JsonProperty("native")
        public String mynative;
    }

    public static class Location{
    }
}
