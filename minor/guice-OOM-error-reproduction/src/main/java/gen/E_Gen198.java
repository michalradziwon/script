
  package gen;
  public class E_Gen198 {
  		@com.google.inject.Inject
  		public E_Gen198(E_Gen199 e_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  