
  package gen;
  public class E_Gen39 {
  		@com.google.inject.Inject
  		public E_Gen39(E_Gen40 e_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  