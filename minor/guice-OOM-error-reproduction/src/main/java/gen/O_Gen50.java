
  package gen;
  public class O_Gen50 {
  		@com.google.inject.Inject
  		public O_Gen50(O_Gen51 o_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  