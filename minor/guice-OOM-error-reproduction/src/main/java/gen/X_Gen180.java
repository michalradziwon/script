
  package gen;
  public class X_Gen180 {
  		@com.google.inject.Inject
  		public X_Gen180(X_Gen181 x_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  