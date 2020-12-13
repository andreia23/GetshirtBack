package br.edu.ifpb.girls.getshirt.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.girls.getshirt.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByIdadeAndCpf(Integer idade, String cpf);

//    @Query("SELECT u FROM Usuario u where u.idade>=60")
    public List<Cliente> getUsuariosIdosos();
}
