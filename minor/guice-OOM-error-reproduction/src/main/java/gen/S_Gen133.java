
  package gen;
  public class S_Gen133 {
  		@com.google.inject.Inject
  		public S_Gen133(S_Gen134 s_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  