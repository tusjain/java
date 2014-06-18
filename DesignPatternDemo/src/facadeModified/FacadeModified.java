package facadeModified;
interface General { 
 public void accessGeneral(); 
} 
 
interface Special extends General { 
 
 public void accessSpecial(); 
 
} 
 
interface Private extends General { 
 
 public void accessPrivate(); 
 
} 
 
class GeneralInfo implements General { 
 
 public void accessGeneral() { 
 
 //... 
 } 
 
 //... 
} 
 
class SpecialInfo extends GeneralInfo implements Special{ 
 
 public void accessSpecial() { 
 
 //... 
 } 
 
} 
 
class PrivateInfo extends SpecialInfo implements Private { 
 
 public void accessPrivate() { 
 
 // ... 
 
 } 
 
 //... 
} 