package tn.pi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tn.pi.entities.Patient;
import tn.pi.repositories.PatientRepository;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("patients", patientList);

        return "patients";

    }
}
