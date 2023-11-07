/*
 * 
 * 1. Serialization is appropriate when saving data for non-Java programs to
 * use. -> False
 * 2. Object state can be saved only by using serialization. => False
 * 3. ObjectOutputStream is a class used to save serialized objects. -> True
 * 4. Chain streams can be usedon their own or with connection streams. -> False
 * 5. A single call to writeObject() can cause many objects to be saved. -> True
 * 6. All classes are serializable by default. -> False
 * 7. The transient modifier allows you to make instance variables serializable.
 * - False
 * 8. If a superclass is not serializable then the subclass can’t be
 * serializable. -> False
 * 9. When objects are deserialized they are read back in last-in, first out
 * sequence. -> False
 * 10. When an object is deserialized, its constructor does not run. -> True
 * 11. Both serialization and saving to a text file can throw exceptions. ->
 * True
 * 12. BufferedWriters can be chained to FileWriters. -> True
 * 13. File objects represent files, but not directories. -> False
 * 14. You can’t force a buffer to send its data before it’s full. -> False
 * 15. Both file readers and file writers can optionally be buffered. -> True
 * 16. The String split() method includes separators as tokens in the result
 * array. -> False
 * 17. Any change to a class breaks previously serialized objects of that class
 * -> False
 */