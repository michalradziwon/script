
  package gen;
  public class E_Gen122 {
  		@com.google.inject.Inject
  		public E_Gen122(E_Gen123 e_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  