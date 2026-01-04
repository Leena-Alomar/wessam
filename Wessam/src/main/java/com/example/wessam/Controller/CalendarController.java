package com.example.wessam.Controller;

import com.example.wessam.Repository.CourseRepository;
import com.example.wessam.Service.CalendarEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/calendar")
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarEventService calendarEventService;
    private final CourseRepository courseRepository;


    @PostMapping("/test-reminder")
    public ResponseEntity<?> testReminder(@RequestBody Map<String, String> request) {
        try {
            String courseName = request.get("courseName");
            String reminderDateStr = request.get("reminderDate");
            LocalDateTime localDateTime = LocalDateTime.parse(reminderDateStr);
            Date reminderDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()
            );
            calendarEventService.createCourseReminder(
                    courseName,
                    reminderDate
            );
            return ResponseEntity.ok("Reminder added to Google Calendar");
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }


}
