
  package gen;
  public class X_Gen73 {
  		@com.google.inject.Inject
  		public X_Gen73(X_Gen74 x_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  