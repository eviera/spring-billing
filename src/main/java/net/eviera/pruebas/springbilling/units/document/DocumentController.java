package net.eviera.pruebas.springbilling.units.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    /**
     * Este metodo se invoca al pegarle a la URL /documents <br>
     * Automáticamente acepta los parámetros page y size que mapea al Pageable <br>
     * Ej: <br>
     * <code>
     *   http://localhost:9000/documents
     *   http://localhost:9000/documents?page=3&size=2
     * </code>
     *
     * @param pageable
     * @return
     */
    @RequestMapping("/documents")
    public Page<Document> getAllPaginated(Pageable pageable) {
        return documentService.getAllPaginated(pageable);
    }



}
