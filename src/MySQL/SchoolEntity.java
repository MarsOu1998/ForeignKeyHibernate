package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "school", schema = "School", catalog = "")
public class SchoolEntity {
    private int schoolId;
    private String schoolName;

    @Id
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolEntity that = (SchoolEntity) o;
        return schoolId == that.schoolId &&
                Objects.equals(schoolName, that.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolId, schoolName);
    }
}
