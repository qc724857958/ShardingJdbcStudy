package com.shone.shardingjdbcdatabasestrategy.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Shone
 * @since 2020-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
public class TOrderItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long orderItemId;

    private Long orderId;

    private String proName;
    
    private Long userId;


}
