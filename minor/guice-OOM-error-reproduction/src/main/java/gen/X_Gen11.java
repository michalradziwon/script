
  package gen;
  public class X_Gen11 {
  		@com.google.inject.Inject
  		public X_Gen11(X_Gen12 x_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  