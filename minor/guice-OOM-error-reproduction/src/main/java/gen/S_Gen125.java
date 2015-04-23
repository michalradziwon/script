
  package gen;
  public class S_Gen125 {
  		@com.google.inject.Inject
  		public S_Gen125(S_Gen126 s_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  