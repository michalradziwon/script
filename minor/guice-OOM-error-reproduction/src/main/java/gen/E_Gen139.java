
  package gen;
  public class E_Gen139 {
  		@com.google.inject.Inject
  		public E_Gen139(E_Gen140 e_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  