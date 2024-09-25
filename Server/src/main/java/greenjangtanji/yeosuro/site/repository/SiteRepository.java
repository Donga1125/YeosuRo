package greenjangtanji.yeosuro.site.repository;


import greenjangtanji.yeosuro.site.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

}
