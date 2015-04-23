
  package gen;
  public class J_Gen50 {
  		@com.google.inject.Inject
  		public J_Gen50(J_Gen51 j_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  