#### **spring transaction propagation 行为:**
    required : 如果当前有运行的事务，则加入当前的事务，如果没有则创建的新的事务去执行
    requires_new: 当前方法如果有事务，则必须启动新的事务
    
#### **事务并发遇到的问题**
    脏读，
    不可重复度
    幻读

#### **事务的隔离级别**
    read uncommited: 读未提交
    read commited： 读已提交
    repateable read： 可重复度
    串行化：避免所有的并发问题，但是带来性能问题
    
    