package com.hyx.service.Impl;

import com.hyx.dao.BannerDao;
import com.hyx.entity.Banner;
import com.hyx.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerDao bannerDao;
    @Override
    public int addBanner(Banner banner) { return bannerDao.addBanner(banner); }
    @Override
    public List<Banner> findBanner() {
        return bannerDao.findBanner();
    }
    @Override
    public int updateBanner(Banner banner) { return bannerDao.updateBanner(banner); }
    @Override
    public int deleteBanner(int id) { return bannerDao.deleteBanner(id); }
}
