package com.hyx.service;

import com.hyx.entity.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bannerService")
public interface BannerService {
    int addBanner(Banner banner);
    List<Banner> findBanner();
    int updateBanner(Banner banner);
    int deleteBanner(int id);
}
