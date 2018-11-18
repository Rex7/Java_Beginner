/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenricsExample;

/**
 *
 * @author Regis charles
 */
class BaseRequest<T>{
public T Entity ;

    public T getEntity() {
        return Entity;
    }

    public void setEntity(T Entity) {
        this.Entity = Entity;
    }
}
class PaginRequestModel{
public int pageno;
public int pagesize;
public int count;

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
   
   
public class SimpleGenerics {
    public static void main(String[] args) {
          BaseRequest<PaginRequestModel> my=new BaseRequest<>();
          my.setEntity(new PaginRequestModel());
          
          my.Entity.setPageno(1);
          my.Entity.setCount(250);
          System.out.println(my.Entity.getPageno());
          
    }
    
    
}
