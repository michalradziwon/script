
  package gen;
  public class S_Gen69 {
  		@com.google.inject.Inject
  		public S_Gen69(S_Gen70 s_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  