package in.srnyapathi.persistence.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RoleEntity {
    @Id
    private String id;
    private String roleName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PermissionEntity> permissionList;
}
