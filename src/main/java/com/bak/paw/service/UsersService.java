package com.bak.paw.service;

import com.bak.paw.model.Users;
import com.bak.paw.repository.UsersRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ApplicationScoped
@ParametersAreNonnullByDefault
public class UsersService {

    @Inject
    UsersRepository usersRepository;
    public List<Users> findAll() {
        return usersRepository.findAllFromDb();
    }
}
