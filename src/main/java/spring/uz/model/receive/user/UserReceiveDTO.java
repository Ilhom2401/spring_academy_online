package spring.uz.model.receive.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReceiveDTO {


    // NotEmtpy -> ""
    // NotBlank -> "            "
    // NotNull -> null

    @NotBlank
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank
    @JsonProperty("last_name")
    private String lastName;

    @Size(min = 9, max = 14)
//    @Pattern(regexp="/\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})/",message="length must be 3")
    @NotNull
    @JsonProperty("phone_number")
    private String phoneNumber;

    private String email;

    @NotEmpty
    private String password;


}
