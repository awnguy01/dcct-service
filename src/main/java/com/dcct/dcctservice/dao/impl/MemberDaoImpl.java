package com.dcct.dcctservice.dao.impl;

import java.util.List;

import com.dcct.dcctservice.dao.MemberDao;
import com.dcct.dcctservice.mock.MockMemberList;
import com.dcct.dcctservice.models.Member;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
    public List<Member> getMembers() {
        return MockMemberList.getMockMemberList();
    }
}