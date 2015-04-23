
  package gen;
  public class E_Gen138 {
  		@com.google.inject.Inject
  		public E_Gen138(E_Gen139 e_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  