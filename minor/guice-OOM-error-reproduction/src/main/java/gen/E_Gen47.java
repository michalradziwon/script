
  package gen;
  public class E_Gen47 {
  		@com.google.inject.Inject
  		public E_Gen47(E_Gen48 e_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  