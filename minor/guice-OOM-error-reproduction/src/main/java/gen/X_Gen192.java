
  package gen;
  public class X_Gen192 {
  		@com.google.inject.Inject
  		public X_Gen192(X_Gen193 x_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  