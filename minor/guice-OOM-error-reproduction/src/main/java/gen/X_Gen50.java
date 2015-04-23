
  package gen;
  public class X_Gen50 {
  		@com.google.inject.Inject
  		public X_Gen50(X_Gen51 x_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  