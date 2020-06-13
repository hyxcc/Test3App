package com.hyx.dao;

import com.hyx.entity.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("bannerDao")
public interface BannerDao {
    int addBanner(Banner banner);
    List<Banner> findBanner();
    int updateBanner(Banner banner);
    int deleteBanner(int id);
}
