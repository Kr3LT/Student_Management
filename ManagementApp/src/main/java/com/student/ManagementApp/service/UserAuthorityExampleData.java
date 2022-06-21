package com.student.ManagementApp.service;

import com.student.ManagementApp.model.security.Authority;
import com.student.ManagementApp.model.security.User;
import com.student.ManagementApp.respository.security.AuthorityRepository;
import com.student.ManagementApp.respository.security.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserAuthorityExampleData implements CommandLineRunner {
    private final AuthorityRepository authorityRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private void loadSecurityData(){
        Authority admin = authorityRepository.save(Authority.builder().role("ADMIN").build());
        Authority staff = authorityRepository.save(Authority.builder().role("STAFF").build());
        Authority student = authorityRepository.save(Authority.builder().role("STUDENT").build());
        Authority teacher = authorityRepository.save(Authority.builder().role("TEACHER").build());

        userRepository.save(User.builder()
                .username("krelt")
                .password(passwordEncoder.encode("123"))
                .authority(admin).build());

        userRepository.save(User.builder()
                .username("staff1")
                .password(passwordEncoder.encode("123"))
                .authority(staff).build());

        userRepository.save(User.builder()
                .username("student1")
                .password(passwordEncoder.encode("123"))
                .authority(student).build());

        userRepository.save(User.builder()
                .username("teacher1")
                .password(passwordEncoder.encode("123"))
                .authority(teacher).build());
        log.debug("Users Loaded: " + userRepository.count());

    }
    @Override
    public void run(String... args) throws Exception {
        if (authorityRepository.count() == 0) {
            loadSecurityData();
        }
    }

}
