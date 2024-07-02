package se.lexicon.g49marketplaceapiwshop.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorDTO {
    private final Integer errorCode;
    private final String errorMessage;
    private final LocalDateTime dateTime = LocalDateTime.now();

    public ErrorDTO(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
