
  package gen;
  public class E_Gen108 {
  		@com.google.inject.Inject
  		public E_Gen108(E_Gen109 e_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  