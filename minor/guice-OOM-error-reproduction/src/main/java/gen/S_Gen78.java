
  package gen;
  public class S_Gen78 {
  		@com.google.inject.Inject
  		public S_Gen78(S_Gen79 s_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  