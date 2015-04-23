
  package gen;
  public class S_Gen50 {
  		@com.google.inject.Inject
  		public S_Gen50(S_Gen51 s_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  