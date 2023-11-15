package com.bak.paw.repository;

import com.bak.paw.model.Users;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ApplicationScoped
@ParametersAreNonnullByDefault
@Transactional
public class UsersRepository implements PanacheRepository<Users> {

    public List<Users> findAllFromDb() {
        return listAll();

    }
}
