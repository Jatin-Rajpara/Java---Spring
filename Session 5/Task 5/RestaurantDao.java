package com.jatin;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDao {

    private JdbcTemplate jdbcTemplate;

   
    private static final String insert =
            "INSERT INTO restaurants VALUES (?, ?, ?, ?)";

    private static final String update =
            "UPDATE restaurants SET name=?, cuisine=?, rating=? WHERE id=?";

    private static final String delete =
            "DELETE FROM restaurants WHERE id=?";

    private static final String all =
            "SELECT * FROM restaurants";

    private static final String above =
            "SELECT * FROM restaurants WHERE rating > 4";


    public RestaurantDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void insertRestaurant(Restaurant restaurant) {

        jdbcTemplate.update(insert,
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getCuisine(),
                restaurant.getRating());
    }


    public void updateRestaurant(Restaurant restaurant) {

        jdbcTemplate.update(update,
                restaurant.getName(),
                restaurant.getCuisine(),
                restaurant.getRating(),
                restaurant.getId());
    }


    public void deleteRestaurant(int id) {

        jdbcTemplate.update(delete, id);
    }


    public List<Restaurant> showall {

        return jdbcTemplate.query(all, (rs, rowNum) -> {

            Restaurant restaurant = new Restaurant();

            restaurant.setId(rs.getInt("id"));
            restaurant.setName(rs.getString("name"));
            restaurant.setCuisine(rs.getString("cuisine"));
            restaurant.setRating(rs.getDouble("rating"));

            return restaurant;
        });
    }


    public List<Restaurant> above {

        List<Restaurant> restaurants =
                jdbcTemplate.query(above, (rs, rowNum) -> {

            Restaurant restaurant = new Restaurant();

            restaurant.setId(rs.getInt("id"));
            restaurant.setName(rs.getString("name"));
            restaurant.setCuisine(rs.getString("cuisine"));
            restaurant.setRating(rs.getDouble("rating"));

            return restaurant;
        });

        for (Restaurant restaurant : restaurants) {
            System.out.println(
                    restaurant.getName() + " - " + restaurant.getCuisine());
        }

        return restaurants;
    }
}