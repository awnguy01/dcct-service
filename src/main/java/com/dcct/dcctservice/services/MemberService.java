package com.dcct.dcctservice.services;

import java.util.List;

import com.dcct.dcctservice.models.Member;

public interface MemberService {
    List<Member> getMembers(String nganh);
}