package co.jp.nakamichi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "price")
public class Contract {

    /** 主キー。自動生成 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 月日。10桁。null不許可 */
    @Column(length = 10, nullable = false)
    private String yearmonth;

    /** 通貨。10桁。null不許可 */
    @Column(length = 10, nullable = false)
    private String currency;

    /** 金額。ドルで小数点以下まで表示する為に、文字列にしている */
    @Column(length = 20, nullable = false)
    private String price;

}
