
  package gen;
  public class S_Gen64 {
  		@com.google.inject.Inject
  		public S_Gen64(S_Gen65 s_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  