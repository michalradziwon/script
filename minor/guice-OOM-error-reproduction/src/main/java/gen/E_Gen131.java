
  package gen;
  public class E_Gen131 {
  		@com.google.inject.Inject
  		public E_Gen131(E_Gen132 e_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  