
  package gen;
  public class E_Gen76 {
  		@com.google.inject.Inject
  		public E_Gen76(E_Gen77 e_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  