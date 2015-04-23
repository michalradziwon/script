
  package gen;
  public class S_Gen168 {
  		@com.google.inject.Inject
  		public S_Gen168(S_Gen169 s_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  