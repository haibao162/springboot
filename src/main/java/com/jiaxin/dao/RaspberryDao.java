package com.jiaxin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiaxin.entity.Raspberry;

public interface RaspberryDao extends JpaRepository<Raspberry, Long>{
	List<Raspberry> findAll();
}
