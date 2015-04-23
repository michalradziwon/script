
  package gen;
  public class S_Gen157 {
  		@com.google.inject.Inject
  		public S_Gen157(S_Gen158 s_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  