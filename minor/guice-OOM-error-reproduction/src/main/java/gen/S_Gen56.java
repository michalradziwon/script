
  package gen;
  public class S_Gen56 {
  		@com.google.inject.Inject
  		public S_Gen56(S_Gen57 s_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  