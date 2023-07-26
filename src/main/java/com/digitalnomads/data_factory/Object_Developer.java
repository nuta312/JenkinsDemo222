package com.digitalnomads.data_factory;

import com.digitalnomads.models.TextBoxModel;
import com.github.javafaker.Faker;

public class Object_Developer {

   static Faker faker = new Faker();
    public static TextBoxModel createFakeTextBoxModel(){
        return new TextBoxModel(faker.name().fullName(),faker.internet().emailAddress(),faker.address().fullAddress(),faker.address().secondaryAddress());
    }
}
