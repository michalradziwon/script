
  package gen;
  public class E_Gen145 {
  		@com.google.inject.Inject
  		public E_Gen145(E_Gen146 e_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  