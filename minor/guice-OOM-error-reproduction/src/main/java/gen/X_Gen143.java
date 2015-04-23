
  package gen;
  public class X_Gen143 {
  		@com.google.inject.Inject
  		public X_Gen143(X_Gen144 x_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  