/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nganhangmau.controller;

import com.nganhangmau.dao.dao;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS PC
 */
@Controller
public class controller {

    @Autowired
    dao dao;
    @RequestMapping("/")
    public String returnIndex() {
        return "html";
    }

    @RequestMapping("/kholuutrumau")
    public String returnkholuutrumau() {
        return "kholuutrumau";
    }

    @RequestMapping("/kiemke")
    public String returnkiemke() {
        return "kiemke";
    }

    @RequestMapping("/xuatmautrongbenhvien")
    public String returnxuatmautrongbenhvien() {
        return "xuatmautrongbenhvien";
    }

    @RequestMapping("/xuatmaungoaibenhvien")
    public String returnxuatmaungoaibenhvien() {
        return "xuatmaungoaibenhvien";
    }

    @RequestMapping("/thanhlytuimau")
    public String returnthanhlytuimau() {
        return "thanhlytuimau";
    }

    @RequestMapping("/hoantratuimau")
    public String returnhoantratuimau() {
        return "hoantratuimau";
    }

    @RequestMapping("/lapphieulinhmau")
    public String lapphieulinhmau(ModelMap map) {
        List<Map<String, Object>> listBN = dao.getBN();
        map.addAttribute("listBN", listBN);
        return "lapphieulinhmau";
    }

    @RequestMapping("/biendongkho")
    public String returnbiendongkho() {
        return "biendongkho";
    }
}
