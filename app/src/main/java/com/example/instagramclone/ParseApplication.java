package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Acih2KjWUrd6dwvmTXz9HtzUjuTgJOdpK68AZJfb")
                .clientKey("zqmUqa6lucGtqelul6iTt5uQMQkiVqjSjLf844fJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
