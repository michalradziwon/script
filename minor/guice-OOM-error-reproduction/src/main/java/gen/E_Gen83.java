
  package gen;
  public class E_Gen83 {
  		@com.google.inject.Inject
  		public E_Gen83(E_Gen84 e_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  