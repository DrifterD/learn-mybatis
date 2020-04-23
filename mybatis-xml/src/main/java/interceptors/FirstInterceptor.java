package interceptors;


import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import sql.CountryMapper;

import java.util.Properties;

@Intercepts(
        {@Signature(type = Executor.class,method = "query",args = {MappedStatement. class , Object . class ,
                RowBounds.class , ResultHandler. class})}
)
public class FirstInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        System.out.println(String.format("name:%s,target class",invocation.getMethod().getName(),invocation.getTarget().getClass()));
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
