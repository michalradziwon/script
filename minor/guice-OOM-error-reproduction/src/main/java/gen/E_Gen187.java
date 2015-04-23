
  package gen;
  public class E_Gen187 {
  		@com.google.inject.Inject
  		public E_Gen187(E_Gen188 e_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  