package lingi2132;

import static jminusminus.CLConstants.*;
import java.util.ArrayList;
import jminusminus.CLEmitter;

public class Generator extends GlobalGenerator {
        
        public Generator(String outputDir) {
                super(outputDir);
        }
        
        
        public void generateClass() {
        CLEmitter e = new CLEmitter(true);
        e.destinationDir(super.outputDir);
        ArrayList<String> accessFlags = new ArrayList<String>();

        // Add ClassToGenerate class
        accessFlags.add("public");
        accessFlags.add("super");
        e.addClass(accessFlags, "packageOfClassToGenerate/ClassToGenerate", "java/lang/Object", null, false);

        // Add the implicit no-arg constructor ClassToGenerate()        
        accessFlags.clear();
        accessFlags.add("public");
        e.addMethod(accessFlags, "<init>", "()V", null, false);
        e.addNoArgInstruction(ALOAD_0);
        e.addMemberAccessInstruction(INVOKESPECIAL, "java/lang/Object",
                "<init>", "()V");
        e.addNoArgInstruction(RETURN);

        // Add binomialCoefficient()
        
        String falseLabel1 = e.createLabel();
        String falseLabel2 = e.createLabel();
        
        accessFlags.clear();
        accessFlags.add("public");
        accessFlags.add("static");
        e.addMethod(accessFlags, "binomialCoefficient", "(II)I", null, false);
        e.addNoArgInstruction(ILOAD_1);
        e.addBranchInstruction(IFEQ, "falseLabel1"); // if k == 0
        e.addNoArgInstruction(ILOAD_1);
        e.addNoArgInstruction(ILOAD_0);
        e.addBranchInstruction(IF_ICMPNE, "falseLabel2"); // if k == n
        
        e.addLabel("falseLabel1");
        e.addNoArgInstruction(ICONST_1);
        e.addNoArgInstruction(IRETURN); // return 1
        
        e.addLabel("falseLabel2"); // else
        e.addNoArgInstruction(ILOAD_0);
        e.addNoArgInstruction(ICONST_1);
        e.addNoArgInstruction(ISUB);
        e.addNoArgInstruction(ILOAD_1);
        e.addMemberAccessInstruction(INVOKESTATIC, "packageOfClassToGenerate/ClassToGenerate", 
                        "binomialCoefficient", "(II)I");
        e.addNoArgInstruction(ILOAD_0);
        e.addNoArgInstruction(ICONST_1);
        e.addNoArgInstruction(ISUB);
        e.addNoArgInstruction(ILOAD_1);
        e.addNoArgInstruction(ICONST_1);
        e.addNoArgInstruction(ISUB);
        e.addMemberAccessInstruction(INVOKESTATIC, "packageOfClassToGenerate/ClassToGenerate", 
                        "binomialCoefficient", "(II)I");
        e.addNoArgInstruction(IADD);
        e.addNoArgInstruction(IRETURN);      
        
        e.write();
   }
        

}
