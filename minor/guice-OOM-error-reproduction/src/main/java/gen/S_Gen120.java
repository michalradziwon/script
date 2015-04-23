
  package gen;
  public class S_Gen120 {
  		@com.google.inject.Inject
  		public S_Gen120(S_Gen121 s_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  