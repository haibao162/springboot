package com.jiaxin.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.jiaxin.entity.Raspberry;
@Service
public interface RaspberryService {
 public List<Raspberry> findAll();
}
