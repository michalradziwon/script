
  package gen;
  public class S_Gen134 {
  		@com.google.inject.Inject
  		public S_Gen134(S_Gen135 s_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  