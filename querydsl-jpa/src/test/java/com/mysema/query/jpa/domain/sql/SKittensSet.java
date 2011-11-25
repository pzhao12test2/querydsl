package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import com.mysema.query.sql.ForeignKey;
import com.mysema.query.sql.PrimaryKey;
import com.mysema.query.sql.RelationalPathBase;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.BeanPath;
import com.mysema.query.types.path.NumberPath;


/**
 * SKittensSet is a Querydsl query type for SKittensSet
 */
public class SKittensSet extends RelationalPathBase<SKittensSet> {

    private static final long serialVersionUID = 1191166719;

    public static final SKittensSet kittensSet = new SKittensSet("KITTENS_SET");

    public final NumberPath<Integer> animalId = createNumber("ANIMAL_ID", Integer.class);

    public final NumberPath<Integer> kittenssetId = createNumber("KITTENSSET_ID", Integer.class);

    public final PrimaryKey<SKittensSet> sql100819184440700 = createPrimaryKey(animalId, kittenssetId);

    public final ForeignKey<SAnimal> fk4fccad6f10a6f310 = new ForeignKey<SAnimal>(this, kittenssetId, "ID");

    public final ForeignKey<SAnimal> fk4fccad6fa295046a = new ForeignKey<SAnimal>(this, animalId, "ID");

    public SKittensSet(String variable) {
        super(SKittensSet.class, forVariable(variable), null, "KITTENS_SET");
    }

    public SKittensSet(BeanPath<? extends SKittensSet> entity) {
        super(entity.getType(), entity.getMetadata(), null, "KITTENS_SET");
    }

    public SKittensSet(PathMetadata<?> metadata) {
        super(SKittensSet.class, metadata, null, "KITTENS_SET");
    }

}

