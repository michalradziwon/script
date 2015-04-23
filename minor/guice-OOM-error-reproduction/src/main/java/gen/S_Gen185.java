
  package gen;
  public class S_Gen185 {
  		@com.google.inject.Inject
  		public S_Gen185(S_Gen186 s_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  