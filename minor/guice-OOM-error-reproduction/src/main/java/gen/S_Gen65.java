
  package gen;
  public class S_Gen65 {
  		@com.google.inject.Inject
  		public S_Gen65(S_Gen66 s_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  