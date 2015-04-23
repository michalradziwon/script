
  package gen;
  public class E_Gen75 {
  		@com.google.inject.Inject
  		public E_Gen75(E_Gen76 e_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  