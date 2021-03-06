package <%=packageName%>.web.rest;

import <%=packageName%>.domain.Logger;
import <%=packageName%>.repository.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for view and managing Log Level at runtime.
 */
@RestController
@RequestMapping("/api/v1/loggers")
public class LoggersResource extends AbstractRestResource<Logger, String, Logger.LoggerWrapper> {
    @Autowired
    private LoggerRepository loggerRepository;

    @Override
    protected Class<Logger> entityClass() {
        return Logger.class;
    }

    @Override
    protected PagingAndSortingRepository<Logger, String> repository() {
        return loggerRepository;
    }

    @Override
    protected Logger.LoggerWrapper entityWrapper(Logger entity) {
        return new Logger.LoggerWrapper(entity);
    }

    @Override
    public ResponseEntity<Void> delete(String s) throws Exception {
        throw new UnsupportedOperationException("Request method 'DELETE' not supported");
    }

    @Override
    public ResponseEntity<Logger.LoggerWrapper> create(Logger.LoggerWrapper v) throws Exception {
        throw new UnsupportedOperationException("Request method 'POST' not supported");
    }
}
