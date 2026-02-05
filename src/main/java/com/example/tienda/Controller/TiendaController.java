import com.example.tienda.model.Tienda;
import com.example.tienda.Repository.TiendaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tiendas")

public class TiendaController {

    private final TiendaRepository repo;

    public TiendaController(TiendaRepository tiendaRepository) {
        this.repo = tiendaRepository;
    }

    @GetMapping
    public List<Tienda> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Tienda obtener(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Tienda agregar(@RequestBody Tienda tienda) {
        return repo.save(tienda);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}