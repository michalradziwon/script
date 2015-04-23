
  package gen;
  public class E_Gen106 {
  		@com.google.inject.Inject
  		public E_Gen106(E_Gen107 e_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  