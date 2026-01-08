package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    @Override
    public String getMoodString() {
        return "Happy";
    }

    public Happy() {
        super();
    }

    public Happy(Date moodDate) {
        super(moodDate);
    }
}
