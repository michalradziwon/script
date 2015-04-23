
  package gen;
  public class X_Gen139 {
  		@com.google.inject.Inject
  		public X_Gen139(X_Gen140 x_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  