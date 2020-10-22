package com.keepleritlimited.demo.repository;


import com.keepleritlimited.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface Repository extends JpaRepository<Users, BigInteger> {
}
