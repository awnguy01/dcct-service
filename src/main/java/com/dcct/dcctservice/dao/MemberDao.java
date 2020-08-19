package com.dcct.dcctservice.dao;

import java.util.List;

import com.dcct.dcctservice.models.Member;

public interface MemberDao {
    List<Member> getMembers();
}