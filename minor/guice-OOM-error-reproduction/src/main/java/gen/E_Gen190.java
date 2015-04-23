
  package gen;
  public class E_Gen190 {
  		@com.google.inject.Inject
  		public E_Gen190(E_Gen191 e_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  