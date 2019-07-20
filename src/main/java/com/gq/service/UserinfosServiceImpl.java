package com.gq.service;

import com.gq.dao.model.Userinfos;
import com.gq.dao.model.UserinfosExample;
import com.gq.dao.mapper.UserinfosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserinfosServiceImpl implements UserinfosService {
    @Autowired
    private UserinfosMapper userinfosMapper;
    @Override
    public void insertUserinfos(Userinfos userinfos) {
        userinfosMapper.insert(userinfos);
    }

    @Override
    public void deleteUserinfos(Integer id) {
        userinfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUserinfos(Userinfos userinfos) {
        userinfosMapper.updateByPrimaryKeySelective(userinfos);
    }

    @Override
    public Userinfos queryUserinfosById(Integer id) {
        return userinfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Userinfos> queryListByParams() {
        return userinfosMapper.selectByExample(new UserinfosExample());
    }
}
