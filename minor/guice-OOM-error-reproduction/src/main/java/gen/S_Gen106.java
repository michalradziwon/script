
  package gen;
  public class S_Gen106 {
  		@com.google.inject.Inject
  		public S_Gen106(S_Gen107 s_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  