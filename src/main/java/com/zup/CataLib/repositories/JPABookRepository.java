package com.zup.CataLib.repositories;

import com.zup.CataLib.models.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPABookRepository extends JpaRepository<BookEntity, Long> {
}
