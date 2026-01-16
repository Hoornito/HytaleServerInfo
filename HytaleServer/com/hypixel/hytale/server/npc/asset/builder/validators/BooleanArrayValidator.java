package com.hypixel.hytale.server.npc.asset.builder.validators;

public abstract class BooleanArrayValidator extends Validator {
  public abstract boolean test(boolean[] paramArrayOfboolean);
  
  public abstract String errorMessage(String paramString, boolean[] paramArrayOfboolean);
  
  public abstract String errorMessage(boolean[] paramArrayOfboolean);
}


/* Location:              C:\Users\Agustin\AppData\Roaming\Hytale\install\release\package\game\latest\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\asset\builder\validators\BooleanArrayValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */