
  package gen;
  public class E_Gen130 {
  		@com.google.inject.Inject
  		public E_Gen130(E_Gen131 e_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  