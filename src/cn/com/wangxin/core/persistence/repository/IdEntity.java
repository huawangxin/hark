package cn.com.wangxin.core.persistence.repository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class IdEntity
{
  protected String id;
  
  @Id
  @GeneratedValue(generator="uuidgenerator")
  @GenericGenerator(name="uuidgenerator", strategy="uuid")
  @Column(length=32)
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
}
