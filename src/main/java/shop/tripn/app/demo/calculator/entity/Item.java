package shop.tripn.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "items")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    @Id private long itemId;
    private String itemName;
    private int price;
    private String description;
    private Date regDate;

    @Override
    public String toString() {
        return "Item List{" +
                "itemNo." + itemId +
                "itemName='" + itemName + '\'' +
                "price=" + price +
                "description='" + description + '\'' +
                "regDate=" + regDate +
                '}';
    }
}
