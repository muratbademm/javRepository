public interface IEntityRepository <T extends IEntity> {
    public  void add(T entity);
    void  delete(T entity);
    void update (T entity);
}
