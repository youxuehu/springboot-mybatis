package com.gq.service;

import com.gq.dao.model.Userinfos;

import java.util.List;

public interface UserinfosService {
    void insertUserinfos(Userinfos userinfos);

    void deleteUserinfos(Integer id);

    void updateUserinfos(Userinfos userinfos);

    Userinfos queryUserinfosById(Integer id);

    List<Userinfos> queryListByParams();
}
