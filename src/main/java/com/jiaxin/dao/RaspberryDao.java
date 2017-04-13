package com.jiaxin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiaxin.entity.Raspberry;
@Repository
public interface RaspberryDao extends JpaRepository<Raspberry, Long>{
	public List<Raspberry> findAll();
	
}
