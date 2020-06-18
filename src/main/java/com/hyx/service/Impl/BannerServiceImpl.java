package com.hyx.service.Impl;

import com.hyx.dao.BannerDao;
import com.hyx.entity.Banner;
import com.hyx.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerDao bannerDao;
    private Long date = new Date().getTime();
    @Override
    public int addBanner(Banner banner) {
        banner.setCreateAt(date);
        banner.setUpdateAt(date);
        banner.setCreateBy("超级管理员");
        banner.setUpdateBy("超级管理员");
        return bannerDao.addBanner(banner); }
    @Override
    public List<Banner> findBanner() {
        return bannerDao.findBanner();
    }
    @Override
    public int updateBanner(Banner banner) {
        banner.setUpdateAt(date);
        banner.setUpdateBy("管理员007");
        return bannerDao.updateBanner(banner); }
    @Override
    public int deleteBanner(int id) { return bannerDao.deleteBanner(id); }
}
