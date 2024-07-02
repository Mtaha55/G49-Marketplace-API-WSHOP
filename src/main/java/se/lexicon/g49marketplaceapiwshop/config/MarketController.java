package se.lexicon.g49marketplaceapiwshop.config;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {

    @GetMapping("/api/Market")
    public String Market() {
        return "Marketplace";
    }
}