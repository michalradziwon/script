
  package gen;
  public class E_Gen64 {
  		@com.google.inject.Inject
  		public E_Gen64(E_Gen65 e_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  