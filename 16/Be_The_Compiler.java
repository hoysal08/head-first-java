/*
 * Compiles ?
 * 
 * ArrayList<Dog> dogs1 = new ArrayList<Animal>(); -> Yes
 * ArrayList<Animal> animals1 = new ArrayList<Dog>(); -> Yes
 * List<Animal> list = new ArrayList<Animal>(); -> No
 * ArrayList<Dog> dogs = new ArrayList<Dog>(); -> No
 * ArrayList<Animal> animals = dogs; -> Yes
 * List<Dog> dogList = dogs; -> No
 * ArrayList<Object> objects = new ArrayList<Object>(); -> No
 * List<Object> objList = objects; -> No
 * ArrayList<Object> objs = new ArrayList<Dog>(); -> Yes
 */