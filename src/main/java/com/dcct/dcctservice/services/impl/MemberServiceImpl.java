package com.dcct.dcctservice.services.impl;

import java.util.List;

import com.dcct.dcctservice.dao.MemberDao;
import com.dcct.dcctservice.models.Member;
import com.dcct.dcctservice.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public List<Member> getMembers(String nganh) {
        return memberDao.getMembers();
    }
}