
  package gen;
  public class X_Gen40 {
  		@com.google.inject.Inject
  		public X_Gen40(X_Gen41 x_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  