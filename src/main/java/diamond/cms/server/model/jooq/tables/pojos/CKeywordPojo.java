/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.pojos;


import diamond.cms.server.model.jooq.tables.interfaces.ICKeyword;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CKeywordPojo implements ICKeyword {

    private static final long serialVersionUID = 319645153;

    private String  id;
    private String  keyword;
    private Integer refNumber;
    private String  fullPinyin;
    private String  simplePinyin;
    private Integer heatNumber;

    public CKeywordPojo() {}

    public CKeywordPojo(CKeywordPojo value) {
        this.id = value.id;
        this.keyword = value.keyword;
        this.refNumber = value.refNumber;
        this.fullPinyin = value.fullPinyin;
        this.simplePinyin = value.simplePinyin;
        this.heatNumber = value.heatNumber;
    }

    public CKeywordPojo(
        String  id,
        String  keyword,
        Integer refNumber,
        String  fullPinyin,
        String  simplePinyin,
        Integer heatNumber
    ) {
        this.id = id;
        this.keyword = keyword;
        this.refNumber = refNumber;
        this.fullPinyin = fullPinyin;
        this.simplePinyin = simplePinyin;
        this.heatNumber = heatNumber;
    }

    @NotNull
    @Size(max = 40)
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 80)
    @Override
    public String getKeyword() {
        return this.keyword;
    }

    @Override
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public Integer getRefNumber() {
        return this.refNumber;
    }

    @Override
    public void setRefNumber(Integer refNumber) {
        this.refNumber = refNumber;
    }

    @NotNull
    @Size(max = 300)
    @Override
    public String getFullPinyin() {
        return this.fullPinyin;
    }

    @Override
    public void setFullPinyin(String fullPinyin) {
        this.fullPinyin = fullPinyin;
    }

    @NotNull
    @Size(max = 80)
    @Override
    public String getSimplePinyin() {
        return this.simplePinyin;
    }

    @Override
    public void setSimplePinyin(String simplePinyin) {
        this.simplePinyin = simplePinyin;
    }

    @Override
    public Integer getHeatNumber() {
        return this.heatNumber;
    }

    @Override
    public void setHeatNumber(Integer heatNumber) {
        this.heatNumber = heatNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CKeywordPojo (");

        sb.append(id);
        sb.append(", ").append(keyword);
        sb.append(", ").append(refNumber);
        sb.append(", ").append(fullPinyin);
        sb.append(", ").append(simplePinyin);
        sb.append(", ").append(heatNumber);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICKeyword from) {
        setId(from.getId());
        setKeyword(from.getKeyword());
        setRefNumber(from.getRefNumber());
        setFullPinyin(from.getFullPinyin());
        setSimplePinyin(from.getSimplePinyin());
        setHeatNumber(from.getHeatNumber());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICKeyword> E into(E into) {
        into.from(this);
        return into;
    }
}
