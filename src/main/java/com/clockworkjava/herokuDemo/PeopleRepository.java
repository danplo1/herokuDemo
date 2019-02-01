package com.clockworkjava.herokuDemo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Daniel_D'AGE on 01.02.2019.
 */
public interface PeopleRepository extends CrudRepository<Person, Long> {


}
