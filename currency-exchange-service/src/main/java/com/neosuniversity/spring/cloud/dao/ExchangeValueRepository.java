package com.neosuniversity.spring.cloud.dao;

import com.neosuniversity.spring.cloud.data.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String form,String to);
}
