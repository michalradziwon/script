
  package gen;
  public class S_Gen109 {
  		@com.google.inject.Inject
  		public S_Gen109(S_Gen110 s_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  