package net.weg.apivendalacteos.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Venda;
import net.weg.apivendalacteos.service.VendaService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/venda")
@AllArgsConstructor
public class VendaController {

    private VendaService vendaService;

    @PostMapping()
    public Venda create(@RequestHeader String vendaJson) throws JsonProcessingException {
        Venda venda = new ObjectMapper().readValue(vendaJson, Venda.class);
        return vendaService.create(venda);}

    @GetMapping()
    public Collection<Venda> findAll(){return vendaService.findAll();}

    @PutMapping()
    public  Venda update(@RequestHeader String vendaJson) throws JsonProcessingException {
        Venda venda = new ObjectMapper().readValue(vendaJson, Venda.class);
        System.out.println(vendaJson);
        System.out.println(venda);
        return vendaService.update(venda);
    }

}
