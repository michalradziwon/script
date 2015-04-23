
  package gen;
  public class E_Gen119 {
  		@com.google.inject.Inject
  		public E_Gen119(E_Gen120 e_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  