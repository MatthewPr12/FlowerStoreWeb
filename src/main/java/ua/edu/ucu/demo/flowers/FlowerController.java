package flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(new Flower(21, "blue", 102),
                new Flower(23, "black", 230),
                new Flower(12, "red", 120));
    }
}
