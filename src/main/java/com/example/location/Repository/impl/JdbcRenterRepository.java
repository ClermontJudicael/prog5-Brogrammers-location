package com.example.location.Repository.impl;

import com.example.location.Entity.Renter.GenericRenter;
import com.example.location.Entity.Renter.Renter;
import com.example.location.Repository.RenterRepository;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

@Repository
public class JdbcRenterRepository implements RenterRepository {

    private static final Logger logger = LoggerFactory.getLogger(JdbcRenterRepository.class);

    private final DataSource db;

    public JdbcRenterRepository(DataSource db) {
        this.db = db;
    }

    @Override
    public Optional<Renter> findById(String id) {
        String sql = "SELECT * FROM renter WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return Optional.of(new GenericRenter(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("type")
                ));
            }
        } catch (SQLException e) {
            logger.error("Error finding renter by id", e);
        }
        return Optional.empty();
    }

    @Override
    public List<Renter> findAll() {
        List<Renter> renters = new ArrayList<>();
        String sql = "SELECT * FROM renter";
        try (Connection conn = db.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                renters.add(new GenericRenter(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("type")
                ));
            }
        } catch (SQLException e) {
            logger.error("Error retrieving all renters", e);
        }
        return renters;
    }

    @Override
    public void save(Renter renter) {
        String sql = "INSERT INTO renter (id, name, type) VALUES (?, ?, ?) " +
                "ON CONFLICT (id) DO UPDATE SET name = EXCLUDED.name, type = EXCLUDED.type";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, renter.getId());
            ps.setString(2, renter.getName());
            ps.setString(3, renter.getType());
            ps.executeUpdate();
        } catch (SQLException e) {
            logger.error("Error saving renter", e);
        }
    }
}
