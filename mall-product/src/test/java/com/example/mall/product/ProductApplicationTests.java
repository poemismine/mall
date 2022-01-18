package com.example.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mall.product.entity.BrandEntity;
import com.example.mall.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    private BrandService brandService;

    //    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("123");
//        brandEntity.setName("1234");
//        brandService.save(brandEntity);
//        System.out.println("ok");

//        List<BrandEntity> brandName = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "1234"));
//        for (BrandEntity entity : brandName) {
//            System.out.println(entity.getName());
//        }
        BrandEntity brandEntity = brandService.getOne(new QueryWrapper<BrandEntity>().eq("name", "1234"));
        System.out.println(brandEntity.getBrandId());
        brandService.removeById(brandEntity.getBrandId());
    }

}
