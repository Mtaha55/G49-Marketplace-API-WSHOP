package se.lexicon.g49marketplaceapiwshop.service;


import org.springframework.stereotype.Service;
import se.lexicon.g49marketplaceapiwshop.dto.AdvertisementDto;
import se.lexicon.g49marketplaceapiwshop.entity.Advertisement;
import se.lexicon.g49marketplaceapiwshop.repository.AdvertisementRepository;
import se.lexicon.g49marketplaceapiwshop.repository.UserRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    private final UserRepository userRepository;

    public AdvertisementService (AdvertisementRepository advertisementRepository , UserRepository userRepository) {
        this.advertisementRepository = advertisementRepository;
        this.userRepository = userRepository;
    }

    public Advertisement createAdvertisement(AdvertisementDto adDto) {
        Advertisement ad = new Advertisement();
        ad.setTitle(adDto.getTitle());
        ad.setDescription(adDto.getDescription());
        ad.setExpirationDate(adDto.getExpirationDate());

        // Assume User is already authenticated and fetched from the context or session
        ad.setUser(userRepository.findById(adDto.getUserId()).orElseThrow(() -> new RuntimeException("User not found")));

        return advertisementRepository.save(ad);
    }

    public List<Advertisement> getActiveAdvertisements() {
        return advertisementRepository.findAllByExpirationDateAfter(LocalDate.now());
    }
}
