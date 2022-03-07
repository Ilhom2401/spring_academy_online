package spring.uz.controller.course;


import lombok.RequiredArgsConstructor;
import model.receive.course.Helper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.uz.service.CourseService;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/add")
    public ResponseEntity<?> addCourse(
            @RequestBody Helper courseReceiveDTO
    ) throws IOException {
        return ResponseEntity.ok(courseService.add(courseReceiveDTO));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getCourseList(){
        return ResponseEntity.ok(courseService.getList());
    }


}
