package cn.nero.ds.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @since 2024/3/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("transaction_details")
public class TransactionDetailsPO {

    @TableId
    private Long id;

    private String orderNo;

    private String title;

    private String itemName;

    private Integer itemNum;

    private BigDecimal unitPrice;

}
