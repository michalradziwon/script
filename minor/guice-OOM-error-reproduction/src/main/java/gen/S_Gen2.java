
  package gen;
  public class S_Gen2 {
  		@com.google.inject.Inject
  		public S_Gen2(S_Gen3 s_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  