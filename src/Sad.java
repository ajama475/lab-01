package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {
    @Override
    public String getMoodString() {
        return "Sad";
    }

    public Sad() {
        super();
    }

    public Sad(Date moodDate) {
        super(moodDate);
    }
}
