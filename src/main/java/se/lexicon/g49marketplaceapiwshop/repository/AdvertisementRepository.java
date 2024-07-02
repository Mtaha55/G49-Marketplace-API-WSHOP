package se.lexicon.g49marketplaceapiwshop.repository;


import org.springframework.stereotype.Repository;
import se.lexicon.g49marketplaceapiwshop.entity.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
    List<Advertisement> findAllByExpirationDateAfter(LocalDate date);
}