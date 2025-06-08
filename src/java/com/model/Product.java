/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author OVERLORD
 */

    public class Product {
          private final int id;
        private  final String name;
        private final String description;
        private final double price;
        private final double rating;
        private  final int reviewCount;
        private  final String imageUrl;
        
        public Product(int id, String name, String description, double price, double rating, int reviewCount, String imageUrl) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.rating = rating;
            this.reviewCount = reviewCount;
            this.imageUrl = imageUrl;
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

        
    }
    

