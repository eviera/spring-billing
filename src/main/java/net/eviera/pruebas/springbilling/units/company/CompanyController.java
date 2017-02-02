package net.eviera.pruebas.springbilling.units.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

}
