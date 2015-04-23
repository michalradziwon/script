
  package gen;
  public class X_Gen97 {
  		@com.google.inject.Inject
  		public X_Gen97(X_Gen98 x_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  