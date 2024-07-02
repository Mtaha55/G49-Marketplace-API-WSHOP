package se.lexicon.g49marketplaceapiwshop.controller;



import se.lexicon.g49marketplaceapiwshop.dto.AdvertisementDto;
import se.lexicon.g49marketplaceapiwshop.entity.Advertisement;
import se.lexicon.g49marketplaceapiwshop.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ads")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @PostMapping
    public ResponseEntity<Advertisement> createAd(@RequestBody AdvertisementDto adDto) {
        Advertisement createdAd = advertisementService.createAdvertisement(adDto);
        return ResponseEntity.ok(createdAd);
    }

    @GetMapping
    public ResponseEntity<List<Advertisement>> getAds() {
        List<Advertisement> ads = advertisementService.getActiveAdvertisements();
        return ResponseEntity.ok(ads);
    }
}
