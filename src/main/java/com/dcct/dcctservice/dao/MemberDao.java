package com.dcct.dcctservice.dao;

import java.util.List;

import com.dcct.dcctservice.models.MemberObject;

public interface MemberDao {
    List<MemberObject> getMembers();
}