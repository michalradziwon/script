
  package gen;
  public class X_Gen127 {
  		@com.google.inject.Inject
  		public X_Gen127(X_Gen128 x_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  