
  package gen;
  public class X_Gen19 {
  		@com.google.inject.Inject
  		public X_Gen19(X_Gen20 x_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  