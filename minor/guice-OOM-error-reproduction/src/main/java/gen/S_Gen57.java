
  package gen;
  public class S_Gen57 {
  		@com.google.inject.Inject
  		public S_Gen57(S_Gen58 s_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  