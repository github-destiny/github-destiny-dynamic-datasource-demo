package cn.nero.ds.service.argrst;

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
public class BuyArgBO {

    private Long userId;

    private String itemName;

    private Integer itemNum;

    private BigDecimal unitPrice;


}
