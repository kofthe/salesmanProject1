package kofthe.salesmanProject.repository;

import kofthe.salesmanProject.model.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepository extends JpaRepository<Salesman, Integer> {
}
