
  package gen;
  public class X_Gen154 {
  		@com.google.inject.Inject
  		public X_Gen154(X_Gen155 x_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  