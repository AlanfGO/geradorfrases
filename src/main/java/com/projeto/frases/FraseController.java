package com.projeto.frases;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class FraseController {

    String[] frases = {
            "Nunca desista",
            "Continue estudando",
            "Voce vai conseguir",
            "Programar muda vidas",
            "Todo especialista ja foi iniciante",
            "Pequenos passos todos os dias",
            "Erro tambem ensina"
    };

    @GetMapping("/")
    public String mostrarFrase(Model model) {

        Random random = new Random();
        String frase = frases[random.nextInt(frases.length)];

        model.addAttribute("frase", frase);

        return "index";
    }
}