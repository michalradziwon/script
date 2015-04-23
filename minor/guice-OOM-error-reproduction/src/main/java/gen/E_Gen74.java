
  package gen;
  public class E_Gen74 {
  		@com.google.inject.Inject
  		public E_Gen74(E_Gen75 e_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  