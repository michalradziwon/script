
  package gen;
  public class O_Gen131 {
  		@com.google.inject.Inject
  		public O_Gen131(O_Gen132 o_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  