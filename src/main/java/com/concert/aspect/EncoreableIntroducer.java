package com.concert.aspect;

import com.concert.perform.DefaultEncoreable;
import com.concert.perform.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.concert.perform.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
