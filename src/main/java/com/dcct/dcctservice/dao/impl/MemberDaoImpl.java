package com.dcct.dcctservice.dao.impl;

import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.dcct.dcctservice.dao.MemberDao;
import com.dcct.dcctservice.dao.mappers.MemberRowMapper;
import com.dcct.dcctservice.models.MemberObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
    public static final String GET_MEMBERS_SQL = "SELECT * FROM members";
    public static final MemberRowMapper memberRowMapper = new MemberRowMapper();

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<MemberObject> getMembers() {
        List<MemberObject> memberList = jdbcTemplate.query(GET_MEMBERS_SQL, memberRowMapper);
        return memberList;
    }
}