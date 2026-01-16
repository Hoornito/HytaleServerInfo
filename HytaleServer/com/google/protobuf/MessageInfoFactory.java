package com.google.protobuf;

@CheckReturnValue
interface MessageInfoFactory {
  boolean isSupported(Class<?> paramClass);
  
  MessageInfo messageInfoFor(Class<?> paramClass);
}


/* Location:              C:\Users\Agustin\AppData\Roaming\Hytale\install\release\package\game\latest\Server\HytaleServer.jar!\com\google\protobuf\MessageInfoFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */