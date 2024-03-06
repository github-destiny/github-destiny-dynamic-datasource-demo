package cn.nero.ds.domain.po;

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
@TableName("user")
public class UserPO {

    private Long id;

    private BigDecimal amount;

    private String username;

    private String mobile;

}
