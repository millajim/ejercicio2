/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examparcial2.controller;
import com.example.examparcial2.model.RegistroVenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author HP
 */
@Controller
public class VentaEntradasController {
    
      @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new RegistroVenta());
        return "registro"; 
    }

    @PostMapping("/registro")
    public String registrarVenta(@ModelAttribute RegistroVenta registro, Model model) {
       
        
        return "exito"; 
    }
}
