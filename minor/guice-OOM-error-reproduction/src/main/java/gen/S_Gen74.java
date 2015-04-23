
  package gen;
  public class S_Gen74 {
  		@com.google.inject.Inject
  		public S_Gen74(S_Gen75 s_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  