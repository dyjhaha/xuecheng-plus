package com.xuecheng.content.model.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("course_category")
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {

    List<CourseCategoryTreeDto> childrenTreeNodes;
}
