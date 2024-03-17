package org.example.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author Yanni
 */
@Data
@ToString
public class Course {

    @TableId(type = IdType.AUTO)
    private Long cid;

    private Long userId;

    private Long corderNo;

    private String cname;

    private String brief;

    private Double price;

    private Integer status;

}
