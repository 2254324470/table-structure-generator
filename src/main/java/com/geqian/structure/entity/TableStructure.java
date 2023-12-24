package com.geqian.structure.entity;

import com.geqian.structure.db.DefaultColumnManager;
import com.geqian.structure.word.TableField;
import com.geqian.structure.word.WriteTableIntercepter;
import lombok.Data;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 列字段信息
 *
 * @author geqian
 * @date 10:45 2023/1/5
 */
@Data
public abstract class TableStructure implements WriteTableIntercepter {

    @TableField(value = "列名", order = 0)
    private String columnName;

    @TableField(value = "数据类型", order = 1)
    private String columnType;

    @TableField(value = "是否能为空", order = 2, exclude = true)
    private String isNullable;

    @TableField(value = "默认值", order = 3, enums = "null->NULL", exclude = true)
    private String columnDefault;

    @TableField(value = "备注", order = 4)
    private String columnComment;


    @Override
    public List<Field> interceptWriteFields(Class<?> objectType, List<Field> fields) {

        List<Class<?>> classes = new ArrayList<>();

        Class<?> classType = objectType;

        while (!Objects.equals(classType, Object.class)) {
            classes.add(classType);
            classType = classType.getSuperclass();
        }

        return classes.stream()
                .map(pojoClass -> Stream.of(pojoClass.getDeclaredFields()).collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .filter(field -> field.isAnnotationPresent(TableField.class) && DefaultColumnManager.getDefaultColumns().contains(field.getName()))
                .collect(Collectors.toList());
    }


}