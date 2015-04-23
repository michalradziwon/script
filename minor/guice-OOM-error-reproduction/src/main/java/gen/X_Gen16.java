
  package gen;
  public class X_Gen16 {
  		@com.google.inject.Inject
  		public X_Gen16(X_Gen17 x_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  