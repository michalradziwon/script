
  package gen;
  public class S_Gen39 {
  		@com.google.inject.Inject
  		public S_Gen39(S_Gen40 s_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  