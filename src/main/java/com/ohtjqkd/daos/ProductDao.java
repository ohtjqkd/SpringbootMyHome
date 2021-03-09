package com.ohtjqkd.daos;

import com.ohtjqkd.dtos.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Log4j2
@Repository
public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<ProductDto> rowMapper = new BeanPropertyRowMapper<ProductDto>(ProductDto.class);
    public List<ProductDto> getAllProducts() {
        List<ProductDto> result = jdbcTemplate.query("select * from product_info", rowMapper);

        for (ProductDto product : result) {
            log.info(product.getName());
        }
        return result;
    };
}
