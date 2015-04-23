
  package gen;
  public class E_Gen36 {
  		@com.google.inject.Inject
  		public E_Gen36(E_Gen37 e_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  