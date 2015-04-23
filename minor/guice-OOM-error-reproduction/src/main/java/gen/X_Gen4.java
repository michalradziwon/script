
  package gen;
  public class X_Gen4 {
  		@com.google.inject.Inject
  		public X_Gen4(X_Gen5 x_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  