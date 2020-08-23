package com.dcct.dcctservice.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dcct.dcctservice.models.MemberObject;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberObject> {
    private final static String ID_COL = "m_id";
    private final static String FIRST_NAME_COL = "f_nm";
    private final static String MIDDLE_NAME_COL = "m_nm";
    private final static String LAST_NAME_COL = "l_nm";
    private final static String BIRTH_DATE_COL = "b_dt";
    private final static String SAINT_NAME_COL = "snt_nm";
    private final static String PHONE_PRIMARY_COL = "phn_pri";
    private final static String PHONE_SECONDARY_COL = "phn_sec";
    private final static String EMAIL_COL = "email";
    private final static String STREET_COL = "street";
    private final static String CITY_COL = "city";
    private final static String STATE_ABB_COL = "state_abb";
    private final static String ZIP_COL = "zip";
    private final static String NGANH_COL = "nganh";
    private final static String CAP_COL = "cap";
    private final static String JOIN_DATE_COL = "join_dt";
    private final static String ACTIVE_COL = "active";

    @Override
    public MemberObject mapRow(ResultSet rs, int rowNum) throws SQLException {
        MemberObject member = new MemberObject();
        member.setId(rs.getInt(ID_COL));
        member.setFirstName(rs.getString(FIRST_NAME_COL));
        member.setMiddleName(rs.getString(MIDDLE_NAME_COL));
        member.setLastName(rs.getString(LAST_NAME_COL));
        member.setBirthDate(rs.getDate(BIRTH_DATE_COL).toLocalDate());
        member.setSaintName(rs.getString(SAINT_NAME_COL));
        member.setPhonePrimary(rs.getString(PHONE_PRIMARY_COL));
        member.setPhoneSecondary(rs.getString(PHONE_SECONDARY_COL));
        member.setEmail(rs.getString(EMAIL_COL));
        member.setStreet(rs.getString(STREET_COL));
        member.setCity(rs.getString(CITY_COL));
        member.setStateAbb(rs.getString(STATE_ABB_COL));
        member.setZip(rs.getString(ZIP_COL));
        member.setNganh(rs.getString(NGANH_COL));
        member.setCap(rs.getInt(CAP_COL));
        member.setJoinDate(rs.getDate(JOIN_DATE_COL).toLocalDate());
        member.setIsActive(rs.getBoolean(ACTIVE_COL));
        return member;
    }
}