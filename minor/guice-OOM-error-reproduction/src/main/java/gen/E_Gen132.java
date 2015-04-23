
  package gen;
  public class E_Gen132 {
  		@com.google.inject.Inject
  		public E_Gen132(E_Gen133 e_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  