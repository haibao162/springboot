package com.jiaxin.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiaxin.dao.RaspberryDao;
import com.jiaxin.entity.Raspberry;
@Service
public class RaspberryServiceImpl implements RaspberryService{
@Autowired 
private RaspberryDao raspberrydao;
public List<Raspberry> findAll(){
	return raspberrydao.findAll();
}

}
