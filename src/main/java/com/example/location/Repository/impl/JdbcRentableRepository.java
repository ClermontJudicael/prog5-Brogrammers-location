package com.example.location.Repository.impl;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Entity.Rentable.RentableImpl;
import com.example.location.Repository.RentableRepository;
import java.sql.*;
import java.util.*;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class JdbcRentableRepository implements RentableRepository {

  private static final Logger logger = LoggerFactory.getLogger(JdbcRentableRepository.class);

  private final DataSource dataSource;

  public JdbcRentableRepository(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public Optional<Rentable> findById(String id) {
    String sql = "SELECT * FROM rentable WHERE id = ?";
    try (Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, id);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        return Optional.of(
            new RentableImpl(
                rs.getString("id"),
                rs.getString("type"),
                rs.getDouble("daily_price"),
                rs.getString("description")));
      }
    } catch (SQLException e) {
      logger.error("Error finding rentable by id", e);
    }
    return Optional.empty();
  }

  @Override
  public List<Rentable> findAll() {
    List<Rentable> list = new ArrayList<>();
    String sql = "SELECT * FROM rentable";
    try (Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
      while (rs.next()) {
        list.add(
            new RentableImpl(
                rs.getString("id"),
                rs.getString("type"),
                rs.getDouble("daily_price"),
                rs.getString("description")));
      }
    } catch (SQLException e) {
      logger.error("Error retrieving all rentables", e);
    }
    return list;
  }

  @Override
  public void save(Rentable rentable) {
    String sql =
        "INSERT INTO rentable (id, type, daily_price, description) VALUES (?, ?, ?, ?) "
            + "ON CONFLICT (id) DO UPDATE SET type = EXCLUDED.type, daily_price = EXCLUDED.daily_price, description = EXCLUDED.description";
    try (Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, rentable.getId());
      ps.setString(2, rentable.getType());
      ps.setDouble(3, rentable.getDailyPrice());
      ps.setString(4, rentable.getDescription());
      ps.executeUpdate();
    } catch (SQLException e) {
      logger.error("Error saving rentable", e);
    }
  }
}
