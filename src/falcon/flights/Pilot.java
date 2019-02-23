/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

/**
 *
 * @author 1896052
 */
public class Pilot {
  String name;
  int experience;
  public void pilot()
  {
      this.name=name;
      this.experience=experience;
  }
  public String getname()
          {
              return name;
          }
  public int getexperience()
  {
      return experience;
  }
  public void setname()
  {
      this.name=name;
  }
  public void setexperience()
  {
      this.experience=experience;
  }
  Plane p1=new Plane();
}

