package us.codezen;

import jakarta.ejb.Stateful;

@Stateful
public class Version {
  private int major;
  private int minor;
  private int patch;

  public Version() {
    this.major = 0;
    this.minor = 0;
    this.patch = 0;
  }

  public String getVersion() {
    return this.major + "." + this.minor + "." + this.patch;
  }
}
