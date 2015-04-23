
  package gen;
  public class E_Gen182 {
  		@com.google.inject.Inject
  		public E_Gen182(E_Gen183 e_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  