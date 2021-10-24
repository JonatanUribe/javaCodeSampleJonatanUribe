package co.edu.udem.devops.taller1.taller1.controller;

//import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udem.devops.taller1.taller1.Foo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/foos")
class FooController {

    //@Autowired
    //private IFooService service;

    //@GetMapping
    //public List<Foo> findAll() {
        //return service.findAll();
    //}

    @GetMapping(value = "/{id}")
    public Foo findById(@PathVariable("id") Long id) {
        //return RestPreconditions.checkFound(service.findById(id));
        System.out.println("findById");
        Foo foo = new Foo();
        return foo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Foo resource) {
        //Preconditions.checkNotNull(resource);
        //return service.create(resource);
        System.out.println("create");
        long varlocal = 0;
        return varlocal;
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Foo resource) {
        //Preconditions.checkNotNull(resource);
        //RestPreconditions.checkNotNull(service.getById(resource.getId()));
        //service.update(resource);
        System.out.println("update");
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        System.out.println("deleteById");
        //service.deleteById(id);

    }

}

