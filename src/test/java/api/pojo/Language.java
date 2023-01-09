package api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {
    public String code;
    public String name;
    @JsonProperty("native")
    public String mynative;

    public Language(String code, String name, String mynative) {
        this.code = code;
        this.name = name;
        this.mynative = mynative;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getMynative() {
        return mynative;
    }
}
