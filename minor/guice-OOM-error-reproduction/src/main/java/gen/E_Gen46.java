
  package gen;
  public class E_Gen46 {
  		@com.google.inject.Inject
  		public E_Gen46(E_Gen47 e_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  