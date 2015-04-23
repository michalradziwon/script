
  package gen;
  public class E_Gen177 {
  		@com.google.inject.Inject
  		public E_Gen177(E_Gen178 e_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  