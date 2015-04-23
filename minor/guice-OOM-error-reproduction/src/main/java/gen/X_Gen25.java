
  package gen;
  public class X_Gen25 {
  		@com.google.inject.Inject
  		public X_Gen25(X_Gen26 x_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  