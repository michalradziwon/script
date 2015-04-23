
  package gen;
  public class X_Gen14 {
  		@com.google.inject.Inject
  		public X_Gen14(X_Gen15 x_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  