package greenjangtanji.yeosuro.site.mapper;

import greenjangtanji.yeosuro.site.dto.SiteDto;
import greenjangtanji.yeosuro.site.dto.SiteReviewDto;
import greenjangtanji.yeosuro.site.entity.Site;
import greenjangtanji.yeosuro.site.entity.SiteReview;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-17T21:59:38+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 17.0.11 (Azul Systems, Inc.)"
)
@Component
public class SiteMapperImpl implements SiteMapper {

    @Override
    public SiteDto.SiteResponseDto siteToSiteResponseDto(Site site) {
        if ( site == null ) {
            return null;
        }

        SiteDto.SiteResponseDto siteResponseDto = new SiteDto.SiteResponseDto();

        siteResponseDto.setId( site.getId() );
        siteResponseDto.setCategory( site.getCategory() );
        siteResponseDto.setMemo( site.getMemo() );
        siteResponseDto.setLatitude( site.getLatitude() );
        siteResponseDto.setLongitude( site.getLongitude() );
        siteResponseDto.setAddress( site.getAddress() );
        siteResponseDto.setVisitDate( site.getVisitDate() );
        siteResponseDto.setStartTime( site.getStartTime() );
        siteResponseDto.setEndTime( site.getEndTime() );

        return siteResponseDto;
    }

    @Override
    public SiteDto.SiteResponseDtoNoDate siteToSiteResponseDtoNoDate(Site site) {
        if ( site == null ) {
            return null;
        }

        SiteDto.SiteResponseDtoNoDate siteResponseDtoNoDate = new SiteDto.SiteResponseDtoNoDate();

        siteResponseDtoNoDate.setId( site.getId() );
        siteResponseDtoNoDate.setCategory( site.getCategory() );
        siteResponseDtoNoDate.setMemo( site.getMemo() );
        siteResponseDtoNoDate.setLatitude( site.getLatitude() );
        siteResponseDtoNoDate.setLongitude( site.getLongitude() );
        siteResponseDtoNoDate.setAddress( site.getAddress() );

        return siteResponseDtoNoDate;
    }

    @Override
    public List<SiteDto.SiteResponseDtoNoDate> siteToSiteResponseDtoNoDateList(List<Site> sites) {
        if ( sites == null ) {
            return null;
        }

        List<SiteDto.SiteResponseDtoNoDate> list = new ArrayList<SiteDto.SiteResponseDtoNoDate>( sites.size() );
        for ( Site site : sites ) {
            list.add( siteToSiteResponseDtoNoDate( site ) );
        }

        return list;
    }

    @Override
    public SiteReviewDto.SiteReviewResponseDto siteReviewToSiteReviewResponseDto(SiteReview siteReview) {
        if ( siteReview == null ) {
            return null;
        }

        SiteReviewDto.SiteReviewResponseDto siteReviewResponseDto = new SiteReviewDto.SiteReviewResponseDto();

        return siteReviewResponseDto;
    }

    @Override
    public SiteReviewDto.SiteReviewResponseDtoNoDate siteReviewToSiteReviewResponseDtoNoDate(SiteReview siteReview) {
        if ( siteReview == null ) {
            return null;
        }

        SiteReviewDto.SiteReviewResponseDtoNoDate siteReviewResponseDtoNoDate = new SiteReviewDto.SiteReviewResponseDtoNoDate();

        return siteReviewResponseDtoNoDate;
    }

    @Override
    public List<SiteReviewDto.SiteReviewResponseDto> siteReviewToSiteReviewResponseDtoList(List<SiteReview> siteReviews) {
        if ( siteReviews == null ) {
            return null;
        }

        List<SiteReviewDto.SiteReviewResponseDto> list = new ArrayList<SiteReviewDto.SiteReviewResponseDto>( siteReviews.size() );
        for ( SiteReview siteReview : siteReviews ) {
            list.add( siteReviewToSiteReviewResponseDto( siteReview ) );
        }

        return list;
    }
}
