
  package gen;
  public class X_Gen144 {
  		@com.google.inject.Inject
  		public X_Gen144(X_Gen145 x_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  