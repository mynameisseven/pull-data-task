package com.newtv.pulldatatask.mapper.primary;

import com.newtv.pulldatatask.entity.primary.Category;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {

    Category getCategory(@Param("cateCode") String code, @Param("provider") String provider);
}
