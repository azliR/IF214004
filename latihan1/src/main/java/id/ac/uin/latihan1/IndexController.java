package id.ac.uin.latihan1;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hello")
    public String hello(@RequestParam String nama) {
        return "Halo " + nama + "! Waktu hari ini " + LocalDateTime.now();
    }
}
