package com.dcct.dcctservice.controllers;

import java.util.List;

import com.dcct.dcctservice.models.MemberObject;
import com.dcct.dcctservice.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public ResponseEntity<List<MemberObject>> getMembers(@RequestParam(value = "nganh", required = false) String nganh) {
        List<MemberObject> memberList = memberService.getMembers(nganh);
        return ResponseEntity.ok(memberList);
    }

}