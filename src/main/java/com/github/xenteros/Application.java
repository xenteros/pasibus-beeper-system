package com.github.xenteros;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Stream;

class Application {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid + " " + uuid.hashCode());
        }

    }
}
