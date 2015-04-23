
  package gen;
  public class S_Gen122 {
  		@com.google.inject.Inject
  		public S_Gen122(S_Gen123 s_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  