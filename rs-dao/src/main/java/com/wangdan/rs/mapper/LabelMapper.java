package com.wangdan.rs.mapper;

import com.wangdan.common.entity.Label;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelMapper {

    int saveLabel(Label label);

    List<Label> listLabels();
}
