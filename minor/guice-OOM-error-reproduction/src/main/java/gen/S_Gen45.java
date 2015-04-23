
  package gen;
  public class S_Gen45 {
  		@com.google.inject.Inject
  		public S_Gen45(S_Gen46 s_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  