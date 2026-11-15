package com.programacionhorario.microvalidar;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<PersonalAdministrativo, Long> {

    PersonalAdministrativo findByDni(String dni);
}
