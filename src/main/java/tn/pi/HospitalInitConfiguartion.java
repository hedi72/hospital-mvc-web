package tn.pi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tn.pi.entities.Medcin;
import tn.pi.entities.Patient;
import tn.pi.repositories.MedcienRepository;
import tn.pi.repositories.PatientRepository;

import java.util.Date;
import java.util.List;


@Configuration
public class HospitalInitConfiguartion {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedcienRepository medcienRepository;
    @Bean
    public CommandLineRunner   init(){
        return args -> {
            Patient patient1 = new Patient();
            patient1.setName("hedi");
            patient1.setDateNaiss(new Date());
            patient1.setScore(123);
            patient1.setMalade(true);
            patientRepository.save(patient1);

            Patient patient2 = new Patient(null,"taieb",new Date(),true,55,null);
            patientRepository.save(patient2);

            List<Patient> Patients = patientRepository.findAll();
            Patients.forEach(patient -> System.out.println(patient.getName()));

            Medcin medcin1 = new Medcin();
            medcin1.setName("hedi");
            medcin1.setSpecialite("generaliste");
            medcin1.setEmail("ff@gmail.com");
            medcienRepository.save(medcin1);


        };
    }



}
