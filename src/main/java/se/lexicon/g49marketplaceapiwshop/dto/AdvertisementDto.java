package se.lexicon.g49marketplaceapiwshop.dto;



import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AdvertisementDto {
    private String title;
    private String description;
    private LocalDate expirationDate;
    private Long userId; // Assuming the user ID is passed from the client
}
