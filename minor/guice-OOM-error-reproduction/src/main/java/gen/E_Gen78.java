
  package gen;
  public class E_Gen78 {
  		@com.google.inject.Inject
  		public E_Gen78(E_Gen79 e_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  