
  package gen;
  public class X_Gen20 {
  		@com.google.inject.Inject
  		public X_Gen20(X_Gen21 x_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  