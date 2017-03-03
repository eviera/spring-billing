package net.eviera.pruebas.springbilling.units.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    /**
     * No usado, se usa {@link #getAllPaginated(Pageable)}, pero se deja como documentación
     * @return
     */
    public List<Document> getAllDocuments() {
        List<Document> result = new ArrayList<>();
        documentRepository.findAll().forEach(result::add);
        return result;
    }


    public Page<Document> getAllPaginated(Pageable pageable) {
        return documentRepository.findAll(pageable);
    }
}
