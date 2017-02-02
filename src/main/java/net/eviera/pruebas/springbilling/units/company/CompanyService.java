package net.eviera.pruebas.springbilling.units.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        List<Company> result = new ArrayList<>();
        companyRepository.findAll().forEach(result::add);
        return result;
    }
}
