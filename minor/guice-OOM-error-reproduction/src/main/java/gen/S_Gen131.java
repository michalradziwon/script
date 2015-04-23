
  package gen;
  public class S_Gen131 {
  		@com.google.inject.Inject
  		public S_Gen131(S_Gen132 s_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  