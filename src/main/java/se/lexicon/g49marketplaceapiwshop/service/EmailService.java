package se.lexicon.g49marketplaceapiwshop.service;


import jakarta.validation.Valid;
import se.lexicon.g49marketplaceapiwshop.dto.EmailDTO;

public interface EmailService {
    void sendEmail(@Valid EmailDTO dto);

}
