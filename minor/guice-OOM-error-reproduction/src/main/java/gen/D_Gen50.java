
  package gen;
  public class D_Gen50 {
  		@com.google.inject.Inject
  		public D_Gen50(D_Gen51 d_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  