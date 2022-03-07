package spring.uz.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    private String message;
    @JsonProperty("status_code")
    private int statusCode;
    private Object data;

    public ApiResponse(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
