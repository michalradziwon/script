
  package gen;
  public class X_Gen179 {
  		@com.google.inject.Inject
  		public X_Gen179(X_Gen180 x_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  