
  package gen;
  public class X_Gen149 {
  		@com.google.inject.Inject
  		public X_Gen149(X_Gen150 x_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  