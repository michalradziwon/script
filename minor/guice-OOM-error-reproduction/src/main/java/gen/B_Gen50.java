
  package gen;
  public class B_Gen50 {
  		@com.google.inject.Inject
  		public B_Gen50(B_Gen51 b_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  