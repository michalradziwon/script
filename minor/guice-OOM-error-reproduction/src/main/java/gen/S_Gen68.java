
  package gen;
  public class S_Gen68 {
  		@com.google.inject.Inject
  		public S_Gen68(S_Gen69 s_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  