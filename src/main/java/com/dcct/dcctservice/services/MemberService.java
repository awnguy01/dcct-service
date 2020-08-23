package com.dcct.dcctservice.services;

import java.util.List;

import com.dcct.dcctservice.models.MemberObject;

public interface MemberService {
    List<MemberObject> getMembers(String nganh);
}