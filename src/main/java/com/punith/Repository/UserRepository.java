package com.punith.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punith.Domain.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
