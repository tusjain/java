

package autowire.constructor;
/**
 * Practically com.bean dependencies are explicitly set in com.bean 
 * configuration files and it is really is a good practice to follow. But 
 * Spring is capable of automatically resolving dependencies at runtime. 
 * This automatic resolution of com.bean dependencies is also called 
 * autowiring. This type of com.bean dependencies can also be referred to as 
 * collaborating beans or just as collaborators.
 * 
 * There are 5 different types of autowiring modes which are ‘no’, ‘byName’, 
 * ‘byType’, ‘constructor’, and ‘autodetect’. In this example, we will discuss
 * ‘constructor‘ mode.
 */

/**
* Autowiring by constructor is similar to byType, but applies to constructor
* arguments. In autowire enabled com.bean, it will look for class type of
* constructor arguments, and then do a autowire by type on all constructor
* arguments. 
* 
* Please note that if there isn't exactly one com.bean of the constructor
* argument type in the container, a fatal error is raised.
*/