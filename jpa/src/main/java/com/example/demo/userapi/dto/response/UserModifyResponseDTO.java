package com.example.demo.userapi.dto.response;

import lombok.*;

@Getter
@ToString @EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
@Builder
public class UserModifyResponseDTO {
    private String email;
    private String name;
    private String address;
}
