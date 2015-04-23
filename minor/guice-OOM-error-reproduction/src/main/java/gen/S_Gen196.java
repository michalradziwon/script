
  package gen;
  public class S_Gen196 {
  		@com.google.inject.Inject
  		public S_Gen196(S_Gen197 s_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  