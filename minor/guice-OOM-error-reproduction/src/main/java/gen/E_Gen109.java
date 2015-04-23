
  package gen;
  public class E_Gen109 {
  		@com.google.inject.Inject
  		public E_Gen109(E_Gen110 e_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  