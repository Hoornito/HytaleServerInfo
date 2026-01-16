/*    */ package com.hypixel.hytale.server.npc.asset.builder.validators;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ public class ValidateIfEnumIsValidator<E extends Enum<E> & Supplier<String>>
/*    */   extends Validator
/*    */ {
/*    */   private final String parameter1;
/*    */   private final Validator validator;
/*    */   private final String parameter2;
/*    */   private final E enumValue;
/*    */   
/*    */   private ValidateIfEnumIsValidator(String p1, Validator validator, String p2, E value) {
/* 16 */     this.parameter1 = p1;
/* 17 */     this.validator = validator;
/* 18 */     this.parameter2 = p2;
/* 19 */     this.enumValue = value;
/*    */   }
/*    */   
/*    */   @Nonnull
/*    */   public static <E extends Enum<E> & Supplier<String>> ValidateIfEnumIsValidator<E> withAttributes(String p1, Validator validator, String p2, E value) {
/*    */     // Byte code:
/*    */     //   0: new com/hypixel/hytale/server/npc/asset/builder/validators/ValidateIfEnumIsValidator
/*    */     //   3: dup
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: aload_2
/*    */     //   7: aload_3
/*    */     //   8: invokespecial <init> : (Ljava/lang/String;Lcom/hypixel/hytale/server/npc/asset/builder/validators/Validator;Ljava/lang/String;Ljava/lang/Enum;)V
/*    */     //   11: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	12	0	p1	Ljava/lang/String;
/*    */     //   0	12	1	validator	Lcom/hypixel/hytale/server/npc/asset/builder/validators/Validator;
/*    */     //   0	12	2	p2	Ljava/lang/String;
/*    */     //   0	12	3	value	Ljava/lang/Enum;
/*    */     // Local variable type table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	12	3	value	TE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agustin\AppData\Roaming\Hytale\install\release\package\game\latest\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\asset\builder\validators\ValidateIfEnumIsValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */