
  package gen;
  public class X_Gen100 {
  		@com.google.inject.Inject
  		public X_Gen100(X_Gen101 x_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  