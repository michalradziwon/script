
  package gen;
  public class X_Gen21 {
  		@com.google.inject.Inject
  		public X_Gen21(X_Gen22 x_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  