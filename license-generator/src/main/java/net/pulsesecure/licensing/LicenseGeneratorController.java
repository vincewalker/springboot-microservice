package net.pulsesecure.licensing;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicenseGeneratorController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/license")
    public License greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new License(counter.incrementAndGet(), name);
    }
	
}
