
  package gen;
  public class S_Gen145 {
  		@com.google.inject.Inject
  		public S_Gen145(S_Gen146 s_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  