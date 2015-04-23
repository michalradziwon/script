
  package gen;
  public class X_Gen90 {
  		@com.google.inject.Inject
  		public X_Gen90(X_Gen91 x_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  