
  package gen;
  public class X_Gen41 {
  		@com.google.inject.Inject
  		public X_Gen41(X_Gen42 x_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  