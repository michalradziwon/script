
  package gen;
  public class E_Gen27 {
  		@com.google.inject.Inject
  		public E_Gen27(E_Gen28 e_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  