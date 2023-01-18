package com.dannygutamafullstack.app.service;




import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dannygutamafullstack.app.entity.User;

public interface UserService {
//Metodo buscar 
  public Iterable<User> findAll();
//Metodo paginacion
  public Page<User>findAll(Pageable pageable);
//Metodo buscar por id
  public  Optional<User> findById(Long id);
  //metodo guardar
  public User save(User user);
  ///Metodo eliminar
  public void deleteById(Long id);
 
  
}
