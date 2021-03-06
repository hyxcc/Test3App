import com.hyx.entity.Banner;
import com.hyx.service.BannerService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-biz.xml")
public class BannerTest {
    @Resource
    private BannerService bannerService;

    @Test
    public void addBanner(){
        Banner banner= new Banner();
        banner.setImage("www.ooo.ooo");
        banner.setState(0);
        banner.setPriority(2);
        banner.setCreateAt(new Date().getTime());
        banner.setUpdateAt(new Date().getTime());
        banner.setUpdateBy("张三丰");
        banner.setCreateBy("张三丰");
        int num = bannerService.addBanner(banner);
        System.out.println(num);
    }
    @Test
    public void findBanner(){
        List<Banner> list = new ArrayList<Banner>();
        list = bannerService.findBanner();
        System.out.println(System.currentTimeMillis());
        System.out.println(list);
    }
    @Test
    public void updateBanner(){
        Banner banner= new Banner();
        banner.setId(2);
        banner.setState(1);
        int num = bannerService.updateBanner(banner);
        System.out.println(num);
    }
    @Ignore
    public void deleteBanner(){
        int num = bannerService.deleteBanner(2);
        System.out.println(num);
    }

}
