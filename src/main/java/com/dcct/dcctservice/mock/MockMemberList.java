package com.dcct.dcctservice.mock;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

import com.dcct.dcctservice.models.Member;

public class MockMemberList {

    public static final List<Member> getMockMemberList() {
        List<Member> MOCK_MEMBER_LIST = new ArrayList<>();
        Member MEMBER_A = new Member();
        Member MEMBER_B = new Member();
        Member MEMBER_C = new Member();
        Member MEMBER_D = new Member();
        MEMBER_A.setFirstName("Kevin");
        MEMBER_A.setLastName("Nguyen");
        MEMBER_A.setNganh("Nghia Si");
        MEMBER_A.setCap(1);
        MEMBER_A.setBirthDate(LocalDateTime.parse("2005-10-03T00:00:00.000"));
        MEMBER_A.setEmail("knguyen123@veym.net");
        MEMBER_A.setPhone("502-847-3234");

        MEMBER_B.setFirstName("Jessica");
        MEMBER_B.setLastName("Tran");
        MEMBER_B.setNganh("Hiep Si");
        MEMBER_B.setCap(2);
        MEMBER_B.setBirthDate(LocalDateTime.parse("2003-07-13T00:00:00.000"));
        MEMBER_B.setEmail("jesst01@veym.net");
        MEMBER_B.setPhone("502-523-8493");

        MEMBER_C.setFirstName("Jenny");
        MEMBER_C.setLastName("Phan");
        MEMBER_C.setNganh("Thieu Nhi");
        MEMBER_C.setCap(1);
        MEMBER_C.setBirthDate(LocalDateTime.parse("2009-08-11T00:00:00.000"));
        MEMBER_C.setEmail("jjphan99@veym.net");
        MEMBER_C.setPhone("502-842-5533");

        MEMBER_D.setFirstName("Mikey");
        MEMBER_D.setLastName("Le");
        MEMBER_D.setNganh("Au Nhi");
        MEMBER_D.setCap(3);
        MEMBER_D.setBirthDate(LocalDateTime.parse("2012-11-23T00:00:00.000"));
        MEMBER_D.setEmail("MikeyLe143@veym.net");
        MEMBER_D.setPhone("502-542-3923");

        MOCK_MEMBER_LIST.add(MEMBER_A);
        MOCK_MEMBER_LIST.add(MEMBER_B);
        MOCK_MEMBER_LIST.add(MEMBER_C);
        MOCK_MEMBER_LIST.add(MEMBER_D);

        return MOCK_MEMBER_LIST;
    }
}