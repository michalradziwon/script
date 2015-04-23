
  package gen;
  public class S_Gen195 {
  		@com.google.inject.Inject
  		public S_Gen195(S_Gen196 s_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  