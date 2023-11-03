/*
 * 
 * 1. A try block must be followed by a catch and a finally block. -> False,
 * either or both.
 * 2. If you write a method that might cause a compiler-checked exception, you
 * must wrap that risky code in a try / catch block. -> False, we have an other
 * option to declare the exception.
 * 3. Catch blocks can be polymorphic. -> true, we can have a parent Exception
 * catch, whoch will handlea l child Exception
 * 4. Only ‘compiler checked’ exceptions can be caught. -> False, runtime
 * exception can be caught.
 * 5. If you define a try / catch block, a matching finally block is optional.
 * -> True.
 * 6. If you define a try block, you can pair it with a matching catch or
 * finally block, or both. -> True, both are acceptable.
 * 7. If you write a method that declares that it can throw a compiler-checked
 * exception, you must also wrap the exception throwing code in a try / catch
 * block. -> False, the declaration is sufficient.
 * 8. The main( ) method in your program must handle all unhandled exceptions
 * thrown to it. -> False, but if it doesn’t the JVM may shut down.
 * 9. A single try block can have many different catch blocks. -> True.
 * 10. A method can only throw one kind of exception. -> False.
 * 11. A finally block will run regardless of whether an exception is thrown. ->
 * True. It’s often used to clean-up partially completed tasks.
 * 12. A finally block can exist without a try block. -> False.
 * 13. A try block can exist by itself, without a catch block or a finally
 * block. -> False.
 * 14. Handling an exception is sometimes referred to as ‘ducking’. -> False,
 * ducking is synonymous with declaring.
 * 15. The order of catch blocks never matters. -> False, broadest exceptions
 * must be caught by the last catch blocks.
 * 16. A method with a try block and a finally block, can optionally declare the
 * exception. -> False, if you don’t have a catch block, you must declare.
 * 17. Runtime exceptions must be handled or declared. -> False.
 */