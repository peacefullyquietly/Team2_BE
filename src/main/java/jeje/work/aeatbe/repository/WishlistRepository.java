package jeje.work.aeatbe.repository;

import jeje.work.aeatbe.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}