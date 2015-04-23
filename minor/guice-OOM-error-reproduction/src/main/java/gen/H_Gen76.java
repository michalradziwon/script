
  package gen;
  public class H_Gen76 {
  		@com.google.inject.Inject
  		public H_Gen76(H_Gen77 h_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  