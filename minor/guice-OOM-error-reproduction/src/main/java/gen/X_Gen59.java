
  package gen;
  public class X_Gen59 {
  		@com.google.inject.Inject
  		public X_Gen59(X_Gen60 x_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  