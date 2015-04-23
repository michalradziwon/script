
  package gen;
  public class S_Gen47 {
  		@com.google.inject.Inject
  		public S_Gen47(S_Gen48 s_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  