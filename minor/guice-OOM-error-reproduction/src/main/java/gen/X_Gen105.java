
  package gen;
  public class X_Gen105 {
  		@com.google.inject.Inject
  		public X_Gen105(X_Gen106 x_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  