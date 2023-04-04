package hello.springmvc.basic.requestmapping;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class MappingClassController {

    @GetMapping("/users")
    public String user(){
        return "get users";
    }

    @PostMapping("users")
    public String addUser(){
        return "post user";
    }

    @GetMapping("users/{userId}")
    public String findUser(@PathVariable Long userId){
        return "get userId = "+userId;
    }

    @PatchMapping("/users/{userId}")
    public String updateUser(@PathVariable Long userId){
        return "update userId = "+userId;
    }
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return "delete userId = "+userId;
    }

}
