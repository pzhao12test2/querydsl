package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;


/**
 * SSysconstraints is a Querydsl query type for SSysconstraints
 */
public class SSysconstraints extends com.mysema.query.sql.RelationalPathBase<SSysconstraints> {

    private static final long serialVersionUID = 1753494650;

    public static final SSysconstraints sysconstraints = new SSysconstraints("SYSCONSTRAINTS");

    public final StringPath constraintid = createString("CONSTRAINTID");

    public final StringPath constraintname = createString("CONSTRAINTNAME");

    public final NumberPath<Integer> referencecount = createNumber("REFERENCECOUNT", Integer.class);

    public final StringPath schemaid = createString("SCHEMAID");

    public final StringPath state = createString("STATE");

    public final StringPath tableid = createString("TABLEID");

    public final StringPath type = createString("TYPE");

    public SSysconstraints(String variable) {
        super(SSysconstraints.class, forVariable(variable), "SYS", "SYSCONSTRAINTS");
    }

    public SSysconstraints(Path<? extends SSysconstraints> entity) {
        super(entity.getType(), entity.getMetadata(), "SYS", "SYSCONSTRAINTS");
    }

    public SSysconstraints(PathMetadata<?> metadata) {
        super(SSysconstraints.class, metadata, "SYS", "SYSCONSTRAINTS");
    }

}

