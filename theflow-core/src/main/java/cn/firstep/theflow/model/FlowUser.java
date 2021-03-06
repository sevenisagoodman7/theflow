package cn.firstep.theflow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Alvin4u
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"name", "roles", "permissions"})
public class FlowUser {

    private String Id;

    private String name;

    private String tenantId;

    private String[] roles;

    private String[] permissions;
}
