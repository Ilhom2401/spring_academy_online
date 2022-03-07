package spring.uz.controller;

import lombok.RequiredArgsConstructor;
import model.receive.user.UserLoginReceiveDTO;
import model.receive.user.UserReceiveDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.uz.service.user.UserService;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(
            @RequestBody @Valid UserReceiveDTO userReceiveDTO
    ) {
        return ResponseEntity.ok(userService.add(userReceiveDTO));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editUser(
            @PathVariable("id") @NotNull Long userId,
            @RequestBody @Valid UserReceiveDTO userReceiveDTO
    ){
        return ResponseEntity.ok(userService.updateById(userId,userReceiveDTO));
    }

    @GetMapping("/get")
    public ResponseEntity<?> getUser(
            @RequestParam(name = "id") @NotNull @Size(min = 3) Long userId
    ){
        return ResponseEntity.ok(userService.getById(userId));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getUserList(){
        return ResponseEntity.ok(userService.getList());
    }

}
