package com.jatin;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDao {

    private JdbcTemplate jdbcTemplate;

    public RestaurantDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Restaurant restaurant) {

        String sql = "INSERT INTO restaurants VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getCuisine(),
                restaurant.getRating());
    }

    public void update(Restaurant restaurant) {

        String sql = "UPDATE restaurants SET name=?, cuisine=?, rating=? WHERE id=?";

        jdbcTemplate.update(sql,
                restaurant.getName(),
                restaurant.getCuisine(),
                restaurant.getRating(),
                restaurant.getId());
    }

    public void delete(int id) {

        String sql = "DELETE FROM restaurants WHERE id=?";

        jdbcTemplate.update(sql, id);
    }

    public List<Restaurant> dis() {

        String sql = "SELECT * FROM restaurants";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {

            Restaurant restaurant = new Restaurant();

            restaurant.setId(rs.getInt("id"));
            restaurant.setName(rs.getString("name"));
            restaurant.setCuisine(rs.getString("cuisine"));
            restaurant.setRating(rs.getDouble("rating"));

            return restaurant;
        });
    }

    public List<Restaurant> getRestaurants {

        String sql = "SELECT * FROM restaurants WHERE rating > 4";

        List<Restaurant> restaurants = jdbcTemplate.query(sql, (rs, rowNum) -> {

            Restaurant restaurant = new Restaurant();

            restaurant.setId(rs.getInt("id"));
            restaurant.setName(rs.getString("name"));
            restaurant.setCuisine(rs.getString("cuisine"));
            restaurant.setRating(rs.getDouble("rating"));

            return restaurant;
        });

        for (Restaurant rs : restaurants) {
            System.out.println(rs.getName() + " - " + rs.getCuisine());
        }

        return restaurants;
    }
}