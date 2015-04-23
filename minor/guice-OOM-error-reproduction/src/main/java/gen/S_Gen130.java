
  package gen;
  public class S_Gen130 {
  		@com.google.inject.Inject
  		public S_Gen130(S_Gen131 s_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  