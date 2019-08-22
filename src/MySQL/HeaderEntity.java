package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "header", schema = "School", catalog = "")
public class HeaderEntity {
    private int headerId;
    private String headerName;

    @Id
    @Column(name = "headerId")
    public int getHeaderId() {
        return headerId;
    }

    public void setHeaderId(int headerId) {
        this.headerId = headerId;
    }

    @Basic
    @Column(name = "headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeaderEntity that = (HeaderEntity) o;
        return headerId == that.headerId &&
                Objects.equals(headerName, that.headerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerId, headerName);
    }
}
