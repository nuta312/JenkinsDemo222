package com.digitalnomads.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TextBoxModel {

    private String userName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

}
