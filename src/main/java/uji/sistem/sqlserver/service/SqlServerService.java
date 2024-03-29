package uji.sistem.sqlserver.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import uji.sistem.sqlserver.repository.ProsesLogLineRepository;
import uji.sistem.sqlserver.repository.ProsesLogTableRepository;
import uji.sistem.sqlserver.model.ProsesLogLine;
import uji.sistem.sqlserver.model.ProsesLogTable;

import java.util.List;

@Service
public class SqlServerService {
    private final ProsesLogLineRepository prosesLogLineRepository;
    private final ProsesLogTableRepository prosesLogTableRepository;
    
    public SqlServerService(ProsesLogLineRepository prosesLogLineRepository, ProsesLogTableRepository prosesLogTableRepository) {
        this.prosesLogLineRepository = prosesLogLineRepository;
        this.prosesLogTableRepository = prosesLogTableRepository;
    }
    
    public List<ProsesLogLine> getAllProsesLogLine() {
        return prosesLogLineRepository.getAllProsesLogLine() ;
    }

    public ProsesLogLine saveProsesLogLine(ProsesLogLine proseslogline) {
        return prosesLogLineRepository.saveProsesLogLine(proseslogline);
    }
   

    public List<ProsesLogTable> getAllProsesLogTable() {
        return prosesLogTableRepository.getAllProsesLogTable() ;
    }

    public ProsesLogTable saveProsesLogTable(ProsesLogTable proseslogtable) {
        return prosesLogTableRepository.saveProsesLogTable(proseslogtable);
    }
    
}
