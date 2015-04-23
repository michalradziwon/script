
  package gen;
  public class E_Gen37 {
  		@com.google.inject.Inject
  		public E_Gen37(E_Gen38 e_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  