package com.fall23.random;

import java.util.Random;

public class RandomNameGenerator {

    public static String generateRandomName(String[] names) {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        String[] names = {"Ismailov Asan", "Nurzat Bekeshev", "Baisalova Eliza", "Kanagatov Azamat",
                "Nishaeva Nazbiike", "Mamysheva Aigul", "Asanbekov Baiaman", "Tumarbekova Bema", "Aigerim Joldowbekova",
                "Tursunbekova Aizhan", "Sultanova Bermet", "Alymbaev Timur", "Temirkanova Asiya", "Imanakhunova Iroda",
                "Abibulla kyzy Aizhamal", "Mirbekova Aidanek", "Konkina Tatyana",
                "Aizirek Nadirbek kyzy", "Okombaeva Gulayim", "Nuraiym Ermekova", "Tumarbekova Akbermet"};

        // Пример использования метода
        String randomName = generateRandomName(names);
        System.out.println("Случайное имя: " + randomName);
    }
}