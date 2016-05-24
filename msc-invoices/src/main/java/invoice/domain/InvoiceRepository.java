package invoice.domain;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {


    List<Invoice> findByIssuer(Long issuer, Sort sort, Pageable pageable);
    List<Invoice> findByIssuerCreateDate(Long issuer, Range range);

}