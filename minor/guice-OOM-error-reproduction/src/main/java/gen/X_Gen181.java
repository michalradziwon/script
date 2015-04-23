
  package gen;
  public class X_Gen181 {
  		@com.google.inject.Inject
  		public X_Gen181(X_Gen182 x_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  