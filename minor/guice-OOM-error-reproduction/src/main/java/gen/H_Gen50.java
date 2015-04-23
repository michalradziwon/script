
  package gen;
  public class H_Gen50 {
  		@com.google.inject.Inject
  		public H_Gen50(H_Gen51 h_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  