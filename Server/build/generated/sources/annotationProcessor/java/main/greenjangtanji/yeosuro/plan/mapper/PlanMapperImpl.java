package greenjangtanji.yeosuro.plan.mapper;

import greenjangtanji.yeosuro.plan.dto.PlanDto;
import greenjangtanji.yeosuro.plan.dto.PlanReviewDto;
import greenjangtanji.yeosuro.plan.entity.Plan;
import greenjangtanji.yeosuro.plan.entity.PlanReview;
import greenjangtanji.yeosuro.site.dto.SiteDto;
import greenjangtanji.yeosuro.site.dto.SiteReviewDto;
import greenjangtanji.yeosuro.site.entity.Site;
import greenjangtanji.yeosuro.site.entity.SiteReview;
import greenjangtanji.yeosuro.user.entity.User;
import java.time.format.DateTimeFormatter;
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
public class PlanMapperImpl implements PlanMapper {

    @Override
    public Plan planPostDtoToPlan(PlanDto.PlanPostDto planPostDto) {
        if ( planPostDto == null ) {
            return null;
        }

        Plan.PlanBuilder plan = Plan.builder();

        plan.title( planPostDto.getTitle() );
        plan.content( planPostDto.getContent() );
        plan.startDate( planPostDto.getStartDate() );
        plan.endDate( planPostDto.getEndDate() );
        plan.sites( sitePostDtoListToSiteList( planPostDto.getSites() ) );

        return plan.build();
    }

    @Override
    public PlanDto.PlanResponseDto planToPlanResponseDto(Plan plan) {
        if ( plan == null ) {
            return null;
        }

        PlanDto.PlanResponseDto planResponseDto = new PlanDto.PlanResponseDto();

        planResponseDto.setUserId( planUserId( plan ) );
        if ( plan.getCreateAt() != null ) {
            planResponseDto.setCreateAt( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( plan.getCreateAt() ) );
        }
        planResponseDto.setSiteList( siteListToSiteResponseDtoList( plan.getSites() ) );
        planResponseDto.setTitle( plan.getTitle() );
        planResponseDto.setContent( plan.getContent() );
        planResponseDto.setStartDate( plan.getStartDate() );
        planResponseDto.setEndDate( plan.getEndDate() );

        return planResponseDto;
    }

    @Override
    public List<PlanDto.PlanResponseDto> planListToPlanResponseDtoList(List<Plan> plans) {
        if ( plans == null ) {
            return null;
        }

        List<PlanDto.PlanResponseDto> list = new ArrayList<PlanDto.PlanResponseDto>( plans.size() );
        for ( Plan plan : plans ) {
            list.add( planToPlanResponseDto( plan ) );
        }

        return list;
    }

    @Override
    public PlanReview planReviewPostDtoToPlanReview(PlanReviewDto.PlanReviewPostDto planReviewDto) {
        if ( planReviewDto == null ) {
            return null;
        }

        PlanReview planReview = new PlanReview();

        if ( planReview.getSiteReviews() != null ) {
            List<SiteReview> list = siteReviewPostDtoListToSiteReviewList( planReviewDto.getSiteReviews() );
            if ( list != null ) {
                planReview.getSiteReviews().addAll( list );
            }
        }

        return planReview;
    }

    @Override
    public PlanReviewDto.PlanReviewResponseDto planReviewToPlanReviewResponseDto(PlanReview planReview) {
        if ( planReview == null ) {
            return null;
        }

        PlanReviewDto.PlanReviewResponseDto planReviewResponseDto = new PlanReviewDto.PlanReviewResponseDto();

        planReviewResponseDto.setUserId( planReviewUserId( planReview ) );
        planReviewResponseDto.setSiteReviewList( siteReviewListToSiteReviewResponseDtoList( planReview.getSiteReviews() ) );

        return planReviewResponseDto;
    }

    protected Site sitePostDtoToSite(SiteDto.SitePostDto sitePostDto) {
        if ( sitePostDto == null ) {
            return null;
        }

        Site.SiteBuilder site = Site.builder();

        site.category( sitePostDto.getCategory() );
        site.memo( sitePostDto.getMemo() );
        site.latitude( sitePostDto.getLatitude() );
        site.longitude( sitePostDto.getLongitude() );
        site.address( sitePostDto.getAddress() );
        site.visitDate( sitePostDto.getVisitDate() );
        site.startTime( sitePostDto.getStartTime() );
        site.endTime( sitePostDto.getEndTime() );

        return site.build();
    }

    protected List<Site> sitePostDtoListToSiteList(List<SiteDto.SitePostDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Site> list1 = new ArrayList<Site>( list.size() );
        for ( SiteDto.SitePostDto sitePostDto : list ) {
            list1.add( sitePostDtoToSite( sitePostDto ) );
        }

        return list1;
    }

    private Long planUserId(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        User user = plan.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected SiteDto.SiteResponseDto siteToSiteResponseDto(Site site) {
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

    protected List<SiteDto.SiteResponseDto> siteListToSiteResponseDtoList(List<Site> list) {
        if ( list == null ) {
            return null;
        }

        List<SiteDto.SiteResponseDto> list1 = new ArrayList<SiteDto.SiteResponseDto>( list.size() );
        for ( Site site : list ) {
            list1.add( siteToSiteResponseDto( site ) );
        }

        return list1;
    }

    protected SiteReview siteReviewPostDtoToSiteReview(SiteReviewDto.SiteReviewPostDto siteReviewPostDto) {
        if ( siteReviewPostDto == null ) {
            return null;
        }

        SiteReview.SiteReviewBuilder siteReview = SiteReview.builder();

        siteReview.contents( siteReviewPostDto.getContents() );

        return siteReview.build();
    }

    protected List<SiteReview> siteReviewPostDtoListToSiteReviewList(List<SiteReviewDto.SiteReviewPostDto> list) {
        if ( list == null ) {
            return null;
        }

        List<SiteReview> list1 = new ArrayList<SiteReview>( list.size() );
        for ( SiteReviewDto.SiteReviewPostDto siteReviewPostDto : list ) {
            list1.add( siteReviewPostDtoToSiteReview( siteReviewPostDto ) );
        }

        return list1;
    }

    private Long planReviewUserId(PlanReview planReview) {
        if ( planReview == null ) {
            return null;
        }
        User user = planReview.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected SiteReviewDto.SiteReviewResponseDto siteReviewToSiteReviewResponseDto(SiteReview siteReview) {
        if ( siteReview == null ) {
            return null;
        }

        SiteReviewDto.SiteReviewResponseDto siteReviewResponseDto = new SiteReviewDto.SiteReviewResponseDto();

        return siteReviewResponseDto;
    }

    protected List<SiteReviewDto.SiteReviewResponseDto> siteReviewListToSiteReviewResponseDtoList(List<SiteReview> list) {
        if ( list == null ) {
            return null;
        }

        List<SiteReviewDto.SiteReviewResponseDto> list1 = new ArrayList<SiteReviewDto.SiteReviewResponseDto>( list.size() );
        for ( SiteReview siteReview : list ) {
            list1.add( siteReviewToSiteReviewResponseDto( siteReview ) );
        }

        return list1;
    }
}
